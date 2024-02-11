package Consultorio;

import java.util.Scanner;

public class Anamnese {
    //static Anamnese vetor [] = new Anamnese[2];
    //static Scanner e = new Scanner(System.in);
    
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
    
    /*public void AmzAna(){
        for (int i = 0; i < vetor.length; i ++){
            if (vetor[i] == null) {
                vetor[i] = new Anamnese();
            }
            vetor[i].setDescricao(e.nextLine());
        }
    }*/
    
    /*public void StatusAna(){
        for (int i = 0; i < vetor.length; i ++){
            System.out.println(vetor[i].getDescricao());
        }
    }*/

    public String toStringAna() {
        return "Anamnese{" + "descricao=" + descricao + '}';
    }
    
}

