package controleatleta.Controller;

import controleatleta.Model.Handebol;
import java.util.ArrayList;

public class ControleHandebol {

    private ArrayList<Handebol> listaHandebol;

    public ControleHandebol() {
        this.listaHandebol = new ArrayList<Handebol>();
    }
    
    public ArrayList<Handebol> getListaHandebol() {
        return listaHandebol;
    }
    
    public void adicionar(Handebol umJogador_de_Habdebol) {
        listaHandebol.add(umJogador_de_Habdebol);
    }
    
    public void remover(Handebol umJogador_de_Habdebol) {
        listaHandebol.remove(umJogador_de_Habdebol);
    }
    
    public Handebol pesquisar(String nome) {
        for (Handebol b: listaHandebol) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
