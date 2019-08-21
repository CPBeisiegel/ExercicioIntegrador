package br.digitalhouse;

import java.util.Date;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private String anoDeLancamento;
    private long codigoISBN;
    private int quantidadeEmEstoque;
    private float preco;

    public Livro(int codigo, String titulo, String autor, String anoDeLancamento, long codigoISBN, int quantidadeEmEstoque, float preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.codigoISBN = codigoISBN;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDeLancamento='" + anoDeLancamento + '\'' +
                ", codigoISBN=" + codigoISBN +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", preco=" + preco +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public long getCodigoISBN() {
        return codigoISBN;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigoISBN(long codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
