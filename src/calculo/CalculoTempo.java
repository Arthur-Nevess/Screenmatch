package calculo;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculoTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void Inclui(Titulo t){
        tempoTotal += t.getDuraçãoEmMinutos();
    }
}
