package ListaEncadeadaConsultorio;

public class ListaEncadeada {

    private Elemento inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public boolean remover(int id) {
        Elemento e = this.inicio;
        if (e.getC().getId() == id) {
            this.inicio = e.getProximo();
            return true;
        } else {
            while (e.getProximo() != null) {
                if (e.getProximo().getC().getId() == id) {
                    e.setProximo(e.getProximo().getProximo());
                    return true;
                } else {
                    e = e.getProximo();
                }
            }
        }
        return false;
    }

    public void adicionar(Consulta c) {
        if (this.inicio == null) {
            this.inicio = new Elemento(c);
        } else {
            Elemento elemento = this.inicio;
            while (elemento.getProximo() != null) {
                elemento = elemento.getProximo();
            }
            elemento.setProximo(new Elemento(c));
        }
    }

    public boolean vazia() {
        if (this.inicio == null) {
            return true;
        }
        return false;
    }

    public void listar() {
        if (!this.vazia()) {
            Elemento elemento = this.inicio;
            System.out.println(elemento);
            while (elemento.getProximo() != null) {
                elemento = elemento.getProximo();
                System.out.println(elemento);
            }
        }
    }

}
