package collections.estruturasDeDados.map.ordenacaoMap;

import java.util.Objects;

public class Livro {

    private String nome;
    private Integer pagina;

    public Livro(String nome, Integer pagina) {
        this.nome = nome;
        this.pagina = pagina;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPagina() {
        return pagina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && pagina.equals(livro.pagina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, pagina);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", pagina=" + pagina +
                '}';
    }
}
