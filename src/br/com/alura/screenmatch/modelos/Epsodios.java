package br.com.alura.screenmatch.modelos;

import calculo.Classificavel;

public class Epsodios implements Classificavel {
    private String nome;
    private Series series;
    private int numero;
    private int totalDeVisualizacao;

    public int getTotalDeVisualizacao() {
        return totalDeVisualizacao;
    }

    public void setTotalDeVisualizacao(int totalDeVisualizacao) {
        this.totalDeVisualizacao = totalDeVisualizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getclassificacao() {
        if (totalDeVisualizacao >= 100){
            return 4;
        }
        else {
            return 2;
        }
    }
}
