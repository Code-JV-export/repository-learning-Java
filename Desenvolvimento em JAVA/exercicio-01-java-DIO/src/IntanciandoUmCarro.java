public class IntanciandoUmCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Del Rey", "Ford", 1978, 5);

        System.out.println(carro1.adicionandoPessoaAoCarro(2));
        System.out.println(carro1.getOcupacao());

        System.out.println(carro1.adicionandoPessoaAoCarro(5));
        System.out.println(carro1.getOcupacao());

        Carro carro2 = new Carro("HB20", "Hyundai", 2020);
        System.out.println(carro2.getModelo());
    }
}
