package Consultorio;

import java.util.Scanner;

public class Especialidade {
    /*static Especialidade vetor [] = new Especialidade[2];
    static Scanner e = new Scanner(System.in);*/
    
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
    
    /*public void AmzEsp(){
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] == null) {
                vetor[i] = new Especialidade();
            }
            vetor[i].setId(i++);
            vetor[i].setNome(e.nextLine());
        }
    }*/
    
    /*public void StatusEsp(){
        for(int i = 0; i<vetor.length;i++){
            System.out.println(vetor[i].getId());
            System.out.println(vetor[i].getNomeEspc1());
        }
    }*/

    public String toStringESP() {
        return "Especialidade{" + "id=" + id + ", nome=" + nome + '}';
    }
    
}