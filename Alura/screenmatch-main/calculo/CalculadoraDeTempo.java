package calculo;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulos titulos){
        tempoTotal += titulos.getDuracaoEmMinutos();
    }


}
