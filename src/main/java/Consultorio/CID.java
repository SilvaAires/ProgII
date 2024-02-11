package Consultorio;

import java.util.Scanner;

public class CID {
    /*static CID vetor [] = new CID[2];
    static Scanner e = new Scanner(System.in);*/
    
    private String CID;
    private String doenca;

    public CID(String CID, String doenca) {
        this.CID = CID;
        this.doenca = doenca;
    }

    public CID() {
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }
    
    /*public void AmzCID(){
        for (int i = 0; i < vetor.length; i ++){
            if (vetor[i] == null) {
                vetor[i] = new CID();
            }
            vetor[i].setCID(e.nextLine());
            vetor[i].setDoenca(e.nextLine());
        }
    }*/
    
    /*public void StatusCID(){
        for (int i = 0; i < vetor.length; i ++){
            System.out.println(vetor[i].getCID());
            System.out.println(vetor[i].getDoenca());
        }
    }*/

    public String toStringCID() {
        return "CID{" + "CID=" + CID + ", doenca=" + doenca + '}';
    }
    
}
