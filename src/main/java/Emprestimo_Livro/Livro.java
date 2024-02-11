package Emprestimo_Livro;

public class Livro {
    private String titulo;
    private int cod;
    private String genero;
    private String autor;
    private int anoLanca;
    private String editora;
    private double valor;

    public Livro(String titulo, int cod, String genero, String autor, int anoLanca, String editora, double valor) {
        this.titulo = titulo;
        this.cod = cod;
        this.genero = genero;
        this.autor = autor;
        this.anoLanca = anoLanca;
        this.editora = editora;
        this.valor = valor;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLanca() {
        return anoLanca;
    }

    public void setAnoLanca(int anoLanca) {
        this.anoLanca = anoLanca;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", cod=" + cod + ", genero=" + genero + ", autor=" + autor + ", anoLanca=" + anoLanca + ", editora=" + editora + ", valor=" + valor + '}';
    }
}
