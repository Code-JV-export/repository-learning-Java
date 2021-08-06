public class Carro {

    private String modelo;
    private String marca;
    private int ano;
    private String variante;
    private int quantidadeDePessoas;
    private int ocupacao;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro(String modelo, String marca, int ano, int quantidadeDePessoas) {
        this.modelo = modelo;
        this.marca = marca;
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getOcupacao() {
        return ocupacao;
    }

    public int getAno() {
        return ano;
    }

    public String adicionandoPessoaAoCarro(int quantidade) {
        if ((ocupacao + quantidade) <= quantidadeDePessoas) {
            ocupacao += quantidade;
            return "Adicionando " + quantidade + " pessoas ao carro";
        }
        return "Ocupação excedida!!";
    }

    public String removerPessoaNoCarro(int quantidade) {
        ocupacao -= quantidade;
        return "removendo a(s) pessoa(s)";
    }
}
