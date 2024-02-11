package Consultorio;

public class Consulta {
    //static Consulta vetor [] = new Consulta [2];
    
    private int id;
    private Medico medico;
    private Paciente paciente;
    private Anamnese anamnese;
    private CID cid;

    public Consulta(int id, Medico medico, Paciente paciente, Anamnese anamnese, CID cid) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.anamnese = anamnese;
        this.cid = cid;
    }

    public Consulta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Anamnese getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(Anamnese anamnese) {
        this.anamnese = anamnese;
    }

    public CID getCid() {
        return cid;
    }

    public void setCid(CID cid) {
        this.cid = cid;
    }
    
    /*public void AmzCons(){
        for (int i = 0; i < vetor.length; i ++){
            if (vetor[i] == null) {
                vetor[i] = new Consulta();
            }
            vetor[i].setId(i++);
        }
    }*/
    
    /*public void StatusCons(){
        for (int i = 0; i < vetor.length; i ++){
            System.out.println(vetor[i].getAnamnese());
            System.out.println(vetor[i].getCid());
            System.out.println(vetor[i].getId());
            System.out.println(vetor[i].getMedico());
            System.out.println(vetor[i].getPaciente());
        }
    }*/
    
    public String toStringCons() {
        return "Consulta{" + "id=" + id + ", medico=" + medico + 
               ", paciente=" + paciente + ", anamnese=" + anamnese + 
               ", cid=" + cid + '}';
    }

}
