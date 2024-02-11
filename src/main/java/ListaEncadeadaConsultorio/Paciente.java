package ListaEncadeadaConsultorio;

public class Paciente {
    
    private String cpf;
    private String nome;

    public Paciente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Paciente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toStringPac() {
        return "Paciente{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }
    
}
