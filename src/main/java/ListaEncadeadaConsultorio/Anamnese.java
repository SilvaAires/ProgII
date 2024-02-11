package ListaEncadeadaConsultorio;

public class Anamnese {

    private String descricao;

    public Anamnese(String descricao) {
        this.descricao = descricao;
    }

    public Anamnese() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toStringAna() {
        return "Anamnese{" + "descricao=" + descricao + '}';
    }
    
}

