package ListaEncadeadaConsultorio;

public class Elemento {
    private Consulta c;
    private Elemento proximo;

    public Elemento(Consulta c) {
        this.c = c;
    }

    public Elemento() {
    }
    public Consulta getC() {
        return c;
    }

    public void setC(Consulta c) {
        this.c = c;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String toString() {
        return this.c.toString();
    }
}

