package Luz;

public class Conta {
    private double kWh;
    private int codId;
    private String dataEmetido;
    private String dataVenci;
    
    public double valorConta(){
        if(this.kWh < 25){
            return 10;
        }else{
            if(this.kWh < 250){
                double sub = 150 - this.kWh;
                double valor = 150 + 10 + (sub * 0.20);
                return valor;
            }else{
                if(this.kWh < 300){
                    double sub = 250 - this.kWh;
                    double valor = 250 + 10 + (sub * 0.25);
                    return valor;
                }else{
                    double sub = 300 - this.kWh;
                    double valor = 300 + 10 + (sub * 0.35);
                    return valor;
                }
            }
        }
    }
    
    public Conta() {
    }

    public Conta(double kWh, int codId, String dataEmetido, String dataVenci) {
        this.kWh = kWh;
        this.codId = codId;
        this.dataEmetido = dataEmetido;
        this.dataVenci = dataVenci;
    }

    public double getkWh() {
        return kWh;
    }

    public void setkWh(double kWh) {
        this.kWh = kWh;
    }

    public int getCodId() {
        return codId;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public String getDataEmetido() {
        return dataEmetido;
    }

    public void setDataEmetido(String dataEmetido) {
        this.dataEmetido = dataEmetido;
    }

    public String getDataVenci() {
        return dataVenci;
    }

    public void setDataVenci(String dataVenci) {
        this.dataVenci = dataVenci;
    }
    
}
