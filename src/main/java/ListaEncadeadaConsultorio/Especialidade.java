package ListaEncadeadaConsultorio;

public class Especialidade {

    private int id;
    private String nome;
   
    public Especialidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Especialidade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEspc1() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toStringESP() {
        return "Especialidade{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}