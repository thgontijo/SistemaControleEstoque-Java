package Domain;

import java.util.Objects;

public class produtosInfosDomain implements Comparable<produtosInfosDomain> {
    private String nome;
    private Integer id;
    private Double preco;
    private Integer quantidade;

    public produtosInfosDomain() {
    }

    public produtosInfosDomain(String nome, Integer id, Double preco, Integer quantidade) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        produtosInfosDomain that = (produtosInfosDomain) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "produtosInfosDomain{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(produtosInfosDomain o) {
        return Integer.compare(this.id, o.id);
    }
}
