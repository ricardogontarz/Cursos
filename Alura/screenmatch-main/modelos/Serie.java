package modelos;

public class Serie extends Titulos{
    private int temporadas;
    private  boolean ativa;
    private  int episodeosPorTempoda;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodeosPorTempoda() {
        return episodeosPorTempoda;
    }

    public void setEpisodeosPorTempoda(int episodeosPorTempoda) {
        this.episodeosPorTempoda = episodeosPorTempoda;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas*episodeosPorTempoda*minutosPorEpisodio;
    }
}
