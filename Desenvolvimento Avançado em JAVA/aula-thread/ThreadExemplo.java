public class ThreadExemplo {

    public static void main(String[] args) {
        GeradorPDF iniciarPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraCarregamento = new BarraDeCarregamento(iniciarPdf);

        iniciarPdf.start();
        iniciarBarraCarregamento.start();
    }
}

class GeradorPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

class BarraDeCarregamento extends Thread{

    private Thread pdf;

    public BarraDeCarregamento(Thread iniciarPdf) {
        this.pdf = iniciarPdf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (pdf.isAlive()) {
                    break;
                }
                System.out.println("Loading ...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


