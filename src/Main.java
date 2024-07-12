import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;

public class Main {
    public static void main(String[] args) {
    //CRIANDO OBJETOS
        Filmes filmes = new Filmes();
        Series series = new Series();

    // FIlMES

        filmes.setNome("The Gift");
        filmes.setAnoDeLançamento(2020);
        filmes.medias(5);
        filmes.medias(4);
        filmes.medias(3);
        filmes.Ficha();
        System.out.println("O filme teve " + filmes.getTotalDeAvaliação() + " avaliações");
        filmes.setDiretor("Ariano");
        System.out.println(filmes.getDiretor());
        filmes.setDuração(128);
        System.out.println("O filme tem %d minutos". formatted(filmes.getDuração()));

    //SERIES

        System.out.println("___________________________________________________________");

        series.setNome("Blind Spot");
        series.setAnoDeLançamento(2013);
        series.medias(5);
        series.medias(5);
        series.medias(3);

        series.setEpPorTemporadas(10);
        series.setDuração(51);
        series.setTemporadas(4);
        series.Ficha();
        System.out.println("A série teve " + series.getTotalDeAvaliação() + " avaliações");
        System.out.println("A serie tem %d minutos". formatted(series.getDuração()));
        System.out.println(series.getDuração());
    }
}