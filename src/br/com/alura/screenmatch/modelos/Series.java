package br.com.alura.screenmatch.modelos;
    public class Series extends Titulo{
        private int temporadas;
        private int epPorTemporadas;
        private boolean ativa;
        private int minutosPorEp;

        public int getTemporadas() {
            return temporadas;
        }

        public void setTemporadas(int temporadas) {
            this.temporadas = temporadas;
        }

        public int getEpPorTemporadas() {
            return epPorTemporadas;
        }

        public void setEpPorTemporadas(int epPorTemporadas) {
            this.epPorTemporadas = epPorTemporadas;
        }

        public boolean isAtiva() {
            return ativa;
        }

        public void setAtiva(boolean ativa) {
            this.ativa = ativa;
        }

        public int getMinutosPorEp() {
            return minutosPorEp;
        }

        public void setMinutosPorEp(int minutosPorEp) {
            this.minutosPorEp = minutosPorEp;
        }

        @Override
        public int setDuração() {
            return temporadas * epPorTemporadas * minutosPorEp;
        }
    }



