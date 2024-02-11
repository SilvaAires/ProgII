package ListaEncadeadaConsultorio;

public class CID {

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

    public String toStringCID() {
        return "CID{" + "CID=" + CID + ", doenca=" + doenca + '}';
    }
    
}
