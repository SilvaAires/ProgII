package ListaEncadeadaConsultorio;

public class Medico {
    
    private String CRM;
    private String nome;
    private Especialidade espec;

    public Medico(String CRM, String nome, Especialidade espec) {
        this.CRM = CRM;
        this.nome = nome;
        this.espec = espec;
    }

    public Medico() {
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade getEspec() {
        return espec;
    }

    public void setEspec(Especialidade espec) {
        this.espec = espec;
    }
    
    public String toStringMedc() {
        return "Medico{" + "CRM=" + CRM + ", nome=" + nome + ", espec=" + espec + '}';
    }
    
}
