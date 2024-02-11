package Consultorio;

import java.util.Scanner;

public class Medico {
    //static Medico vetor [] = new Medico[2];
    //static Scanner e = new Scanner(System.in);
    
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
    
    /*public void AmzMed(){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == null) {
                vetor[i] = new Medico();
            }
            vetor[i].setCRM(e.nextLine());
            vetor[i].setNome(e.nextLine());
            Especialidade esp = new Especialidade();
            esp.getNomeEspc1();
            esp.getId();
            vetor[i].setEspec(esp);
        }
    }*/
    
    /*public void StatusMed(){
        for(int i = 0; i<vetor.length;i++){
            System.out.println(vetor[i].getCRM());
            System.out.println(vetor[i].getNome());
            System.out.println(vetor[i].getEspec());
        }
    }*/
    
    public String toStringMedc() {
        return "Medico{" + "CRM=" + CRM + ", nome=" + nome + ", espec=" + espec + '}';
    }
    
}
