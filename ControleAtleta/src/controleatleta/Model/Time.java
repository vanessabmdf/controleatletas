package controleatleta.Model;

public class Time {

    private String nomeTime;
    private int numero_camisa;

    public Time(String nomeTime, int numero_camisa) {
        this.nomeTime = nomeTime;
        this.numero_camisa = numero_camisa;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public int getNumeroCamisa() {
        return numero_camisa;
    }

    public void setNumeroCamisa(int numero_camisa) {
        this.numero_camisa = numero_camisa;
    }
    
    @Override
    public String toString() {
        return this.numero_camisa + " - " + this.nomeTime;
    }
}
