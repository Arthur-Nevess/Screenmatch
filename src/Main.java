import br.com.alura.screenmatch.modelos.Epsodios;
import br.com.alura.screenmatch.modelos.Filmes;
import br.com.alura.screenmatch.modelos.Series;
import calculo.CalculoTempo;
import calculo.FiltroRecomendacao;

public class Main {
    public static void main(String[] args) {
    //CRIANDO OBJETOS
        Filmes filmes = new Filmes();
        Filmes outroFilme = new Filmes();
        Series Blindspot = new Series();

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
        filmes.setDuraçãoEmMinutos(120);
        System.out.println("O filme tem a duração de " + filmes.getDuraçãoEmMinutos() + " minutos");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filmes);


        outroFilme.setDuraçãoEmMinutos(180);
    //SERIES

        System.out.println("___________________________________________________________");

        Blindspot.setNome("Blind Spot");
        Blindspot.setAnoDeLançamento(2013);
        Blindspot.medias(5);
        Blindspot.medias(5);
        Blindspot.medias(3);

        Blindspot.setEpPorTemporadas(10);
        Blindspot.setTemporadas(4);
        Blindspot.setMinutosPorEp(100);
        Blindspot.Ficha();
        System.out.println("A série teve " + Blindspot.getTotalDeAvaliação() + " avaliações");
        System.out.println("Para maratonar a série, levara %d minutos".formatted(Blindspot.getDuraçãoEmMinutos()));

        System.out.println("Sobre blinspot:");
        Epsodios epsodios = new Epsodios();
        epsodios.setNumero(2);
        epsodios.setSeries(Blindspot);
        epsodios.setTotalDeVisualizacao(100);
        filtro.filtra(epsodios);


    }
}