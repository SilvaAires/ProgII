package Consultorio;

import java.util.Scanner;

public class Paciente {
    //static Paciente vetor [] = new Paciente[2];
    //static Scanner e = new Scanner(System.in);
    
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

    /*public void AmzPac(){
        for(int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = new Paciente();
            }
            System.out.println("cpf");
            vetor[i].setCpf(e.next());
            System.out.println("nome");
            vetor[i].setNome(e.next());
        }
    }*/
    
    /*public void StatusPac(){
        for(int i = 0; i<vetor.length;i++){
            System.out.println(vetor[i].getCpf());
            System.out.println(vetor[i].getNome());
        }
    }*/
    
    public String toStringPac() {
        return "Paciente{" + "cpf=" + cpf + ", nome=" + nome + '}';
    }
    
}
