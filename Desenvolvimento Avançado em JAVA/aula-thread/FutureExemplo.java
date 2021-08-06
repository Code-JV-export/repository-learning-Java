import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<? extends Future<String>> futuros = new CopyOnWriteArrayList<>
                (casa.obterAfazeresDeCasa().stream()
                .map(ativididade -> threadPool.submit(() -> {
                        try {
                            return ativididade.realizar();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return null;
                    })
                )
                .collect(Collectors.toList()));

        while (true) {
            int numerosDeAtividadesNaoFinalizadas = 0;
            for (Future<?> futuro: futuros) {
                if (futuro.isDone()) {
                    try {
                        System.out.println("Parabens! você terminou de " + futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numerosDeAtividadesNaoFinalizadas++;
                }
            }
            if (futuros.stream().allMatch(Future::isDone)) {
                break;
            }

            System.out.println("numero de atividades não finalizadas :: " + numerosDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
        threadPool.shutdown();
    }
}

class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<Ativididade> obterAfazeresDeCasa () {
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Ativididade>(), (pivo, atividade) -> {
                    pivo.addAll(atividade);
                    return pivo;
                });
    }
}

interface Ativididade {
    String realizar() throws InterruptedException;
}

abstract class Comodo {
    abstract List<Ativididade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
    @Override
    List<Ativididade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa);
    }

    private String arrumarGuardaRoupa () throws InterruptedException {
        Thread.sleep(5000);
        String arrumarOGuardaRoupa = "Arrumar o guarda roupa";
        System.out.println(arrumarOGuardaRoupa);
        return arrumarOGuardaRoupa;
    }

    private String varrerOQuarto () throws InterruptedException {
        Thread.sleep(7000);
        String varrerOQuarto = "Varrer o quarto";
        System.out.println(varrerOQuarto);
        return varrerOQuarto;
    }

    private String arrumarACama() throws InterruptedException {
        Thread.sleep(10000);
        String arrumarACama = "Arrumar a cama";
        System.out.println(arrumarACama);
        return arrumarACama;
    }
}
