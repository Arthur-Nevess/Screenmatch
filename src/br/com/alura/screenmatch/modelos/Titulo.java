package br.com.alura.screenmatch.modelos;

public abstract class Titulo {
    private String nome = "";
    private int anoDeLançamento = 0;
    private boolean incluidoNoPlano = false;
    private double avaliação = 0.00;
    private int totalDeAvaliação = 0;
    private int duração = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int nota = 0;

    public int getDuração() {
        return duração;
    }

    public void Ficha () {
        System.out.printf("""
                     %s, lançado em %d tem uma média de %.2f estrelas e foi avalidado por %d pessoas
                      """, nome, anoDeLançamento, pegaMedia(), totalDeAvaliação);
    }

    public void medias (int nota){
        avaliação += nota;
        totalDeAvaliação++;
    }

    double pegaMedia(){
        return avaliação/totalDeAvaliação;
    }

    public int getTotalDeAvaliação(){
        return totalDeAvaliação;
    }

    public void setAnoDeLançamento(int anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    public void setAvaliação(double avaliação) {
        this.avaliação = avaliação;
    }

    public void setDuração(int duração) {
        this.duração = duração;
    }

    public abstract int setDuração();
}
