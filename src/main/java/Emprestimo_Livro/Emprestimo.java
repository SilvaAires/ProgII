package Emprestimo_Livro;

public class Emprestimo {
    private Pessoa p;
    private Livro l;
    private int dataRetirada;
    private int dataDevolucao;
    private int codId;

    public Emprestimo(Pessoa p, Livro l, int dataRetirada, int dataDevolucao, int codId) {
        this.p = p;
        this.l = l;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.codId = codId;
    }

    public Emprestimo() {
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public Livro getL() {
        return l;
    }

    public void setL(Livro l) {
        this.l = l;
    }

    public int getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(int dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodId() {
        return codId;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "p=" + p + ", l=" + l + ", dataRetirada=" + dataRetirada + ", dataDevolucao=" + dataDevolucao + ", codId=" + codId + '}';
    }
    
}
