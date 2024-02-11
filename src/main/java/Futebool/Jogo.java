package Futebool;

public class Jogo {

    private String timeCasa;
    private String golsCasa;
    private String timeVisitante;
    private String golsVisitante;
    private int limite;

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getGolsCasa() {
        return golsCasa;
    }

    public void setGolsCasa(String golsCasa) {
        this.golsCasa = golsCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public String getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(String golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public String toString() {
        return this.timeCasa + ";" + this.golsCasa + ";" + this.timeVisitante + ";" + golsVisitante;
    }

    public void ResultadosGravar() {
        if (this.limite <= 20) {
            Arquivo arq = new Arquivo("numeroPartida.txt");
            arq.gravar(getTimeCasa());
            arq.gravar(getGolsCasa());
            arq.gravar(getGolsVisitante());
            arq.gravar(getTimeVisitante());
            //arq.gravar(toString());
        }
        this.limite++;
    }
    
    public String[] retorno = {""};
    
    public String[] ler() {
        int aux = 2;
        int aux1 = 0;
        int aux2 = 1;
        Arquivo arq = new Arquivo("numeroPartida.txt");
        this.retorno = arq.ler().split(";");
        //String vetor[] = retorno.split(";");

        if (this.limite <= 20) {
            for (int i = 0; i < retorno.length; i++) {
                if ((i) == (aux1)) {
                    System.out.println("");
                    System.out.println("Jogo" + aux2);
                    aux2 ++;
                    aux1 += 4;
                }
                System.out.println(retorno[i]);
                if (i == (aux-1)) {
                    System.out.println("x VS x");
                    aux += 4;
                }
            }
        }else{
            System.out.println("Erro");
        }

        return retorno;
    }
    
    public boolean vazia(){
        if (this.retorno == null){
            return true;
        }
        for (int i = 0; i < retorno.length; i++) {
            this.limite++;
        }
        return false;
    }

}
