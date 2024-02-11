package Emprestimo_Livro;

public class Pessoa {
    private String nome;
    private String CPF;
    private int anoNascc;
    private String endereco;

    public Pessoa(String nome, String CPF, int anoNascc, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.anoNascc = anoNascc;
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAnoNascc() {
        return anoNascc;
    }

    public void setAnoNascc(int anoNascc) {
        this.anoNascc = anoNascc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", CPF=" + CPF + ", anoNascc=" + anoNascc + ", endereco=" + endereco + '}';
    }
}
