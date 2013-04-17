package controleatleta;

import java.util.ArrayList;

public class Handebol extends Atleta {

    private char posicao; //Pontas , Armadores , Pivo , Goleiros
    private ArrayList<Time> times;
    private String Federacao_esportiva;
    private String participacao;
    private int saldoGols;
    private int quantidadeExpulsoes;
    private int numeroUniforme;    

    public Handebol(String nome) {
        super(nome);
    }

    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }

    public String getFederacao_esportiva() {
        return Federacao_esportiva;
    }

    public void setFederacao_esportiva(String Federacao_esportiva) {
        this.Federacao_esportiva = Federacao_esportiva;
    }
    
    public String getParticipacao() {
        return participacao;
    }

    public void setParticipacao(String participacao) {
        this.participacao = participacao;
    }
    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public int getQuantidadeExpulsoes() {
        return quantidadeExpulsoes;
    }

    public void setQuantidadeExpulsoes(int quantidadeExpulsoes) {
        this.quantidadeExpulsoes = quantidadeExpulsoes;
    }
    
    public int getNumeroUniforme() {
        return numeroUniforme;
    }

    public void setNumeroUniforme(int numeroUniforme) {
        this.numeroUniforme = numeroUniforme;
    }
    
}
