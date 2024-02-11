package Consultorio;

import java.util.Scanner;

public class Metodos {
    static Scanner e = new Scanner(System.in);
    Especialidade vetorEsp [] = new Especialidade[2];
    CID vetorCid [] = new CID[2];
    Anamnese vetorAna [] = new Anamnese[2];
    Paciente vetorPac[] = new Paciente[2];
    Medico vetorMed [] = new Medico[2];
    Consulta vetorCon [] = new Consulta [2];
    int auxEsp = 0;
    int auxCon = 0;
    
    public void AmzEsp() {
        for (int i = 0; i < vetorEsp.length; i++) {
            if (vetorEsp[i] == null) {
                vetorEsp[i] = new Especialidade();
            }
            vetorEsp[i].setId(auxEsp++);
            System.out.println("Nome: ");
            vetorEsp[i].setNome(e.nextLine());
            System.out.println("---------------------------------");
        }
    }

    public void StatusEsp(){
        for(int i = 0; i<vetorEsp.length;i++){
            System.out.println("---------------------------------");
            System.out.println(vetorEsp[i].getId());
            System.out.println(vetorEsp[i].getNomeEspc1());
            System.out.println("---------------------------------");
        }
    }
    
    public void AmzCID(){
        for (int i = 0; i < vetorCid.length; i ++){
            if (vetorCid[i] == null) {
                vetorCid[i] = new CID();
            }
            System.out.println("CID: ");
            vetorCid[i].setCID(e.nextLine());
            System.out.println("Doença: ");
            vetorCid[i].setDoenca(e.nextLine());
            System.out.println("---------------------------------");
        }
    }
    
    public void StatusCID(){
        for (int i = 0; i < vetorCid.length; i ++){
            System.out.println("---------------------------------");
            System.out.println(vetorCid[i].getCID());
            System.out.println(vetorCid[i].getDoenca());
            System.out.println("---------------------------------");
        }
    }
    
    public void AmzAna(){
        for (int i = 0; i < vetorAna.length; i ++){
            if (vetorAna[i] == null) {
                vetorAna[i] = new Anamnese();
            }
            System.out.println("Descrição: ");
            vetorAna[i].setDescricao(e.nextLine());
            System.out.println("---------------------------------");
        }
    }
    
    public void StatusAna(){
        for (int i = 0; i < vetorAna.length; i ++){
            System.out.println("---------------------------------");
            System.out.println(vetorAna[i].getDescricao());
            System.out.println("---------------------------------");
        }
    }
    
    public void AmzPac(){
        for(int i = 0; i < vetorPac.length; i++) {
            if (vetorPac[i] == null) {
                vetorPac[i] = new Paciente();
            }
            System.out.println("CPF: ");
            vetorPac[i].setCpf(e.next());
            System.out.println("Nome: ");
            vetorPac[i].setNome(e.next());
            System.out.println("---------------------------------");
        }
    }
    
    public void StatusPac(){
        for(int i = 0; i<vetorPac.length;i++){
            System.out.println("---------------------------------");
            System.out.println(vetorPac[i].getCpf());
            System.out.println(vetorPac[i].getNome());
            System.out.println("---------------------------------");
        }
    }
    
    public void AmzMed(){
        for (int i = 0; i < vetorMed.length; i++){
            if (vetorMed[i] == null) {
                vetorMed[i] = new Medico();
            }
            System.out.println("CRM: ");
            vetorMed[i].setCRM(e.nextLine());
            System.out.println("Nome: ");
            vetorMed[i].setNome(e.nextLine());
            System.out.println("Espc");
            int num = vetorEsp[i].getId();
            String name = vetorEsp[i].getNomeEspc1();
            Especialidade esp = new Especialidade();
            esp.setNome(name);
            esp.setId(num);
            vetorMed[i].setEspec(esp);
            System.out.println("---------------------------------");
        }
    }
    
    public void StatusMed(){
        for(int i = 0; i<vetorMed.length;i++){
            System.out.println("---------------------------------");
            System.out.println(vetorMed[i].getCRM());
            System.out.println(vetorMed[i].getNome());
            System.out.println(vetorMed[i].getEspec().getNomeEspc1());
            System.out.println(vetorMed[i].getEspec().getId());
            System.out.println("---------------------------------");
        }
    }
    
    public void AmzCons(){
        for (int i = 0; i < vetorCon.length; i ++){
            if (vetorCon[i] == null) {
                vetorCon[i] = new Consulta();
            }
            System.out.println("Posição: " + i);
            vetorCon[i].setId(auxCon++);
            
            String desc = vetorAna[i].getDescricao();
            Anamnese ana = new Anamnese();
            ana.setDescricao(desc);
            vetorCon[i].setAnamnese(ana);
            
            String era = vetorCid[i].getCID();
            String gelo = vetorCid[i].getDoenca();
            CID cid = new CID();
            cid.setCID(era);
            cid.setDoenca(gelo);
            vetorCon[i].setCid(cid);
            
            String nome = vetorMed[i].getNome();
            String crm = vetorMed[i].getCRM();
            // deu ruim especialidade
            Medico m = new Medico();
            m.setCRM(crm);
            m.setNome(nome);
            m.setEspec(vetorEsp[i]);
            vetorCon[i].setMedico(m);
            
            String cpf = vetorPac[i].getCpf();
            String name = vetorPac[i].getNome();
            Paciente p = new Paciente();
            p.setCpf(cpf);
            p.setNome(name);
            vetorCon[i].setPaciente(p);
            System.out.println("---------------------------------");
        }
    }
    
    public void StatusCons(){
        for (int i = 0; i < vetorCon.length; i ++){
            System.out.println("---------------------------------");
            System.out.println(vetorCon[i].getAnamnese().getDescricao());
            System.out.println(vetorCon[i].getCid().getCID());
            System.out.println(vetorCon[i].getCid().getDoenca());
            System.out.println(vetorCon[i].getId());
            System.out.println(vetorCon[i].getMedico().getCRM());
            System.out.println(vetorCon[i].getMedico().getEspec().getId());
            System.out.println(vetorCon[i].getMedico().getEspec().getNomeEspc1());
            System.out.println(vetorCon[i].getMedico().getNome());
            System.out.println(vetorCon[i].getPaciente().getCpf());
            System.out.println(vetorCon[i].getPaciente().getNome());
            System.out.println("---------------------------------");
        }
    }
}
