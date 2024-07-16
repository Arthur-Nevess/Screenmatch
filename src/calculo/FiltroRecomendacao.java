package calculo;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel){
        if (classificavel.getclassificacao() >= 4) {
            System.out.println("Está entre os melhores do momento");
        }
        else if (classificavel.getclassificacao() <= 2) {
            System.out.println("Bem avaliado no momento");
        }
        else{
            System.out.println("Coloque na lista para assistir depois");
        }
    }
}
