import calculo.CalculadoraDeTempo;
import calculo.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O podereso chefão");
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setAnoDeLancamento(1980);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(4);
        meuFilme.avalia(2);
        meuFilme.avalia(6);

        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodeosPorTempoda(10);
        lost.setMinutosPorEpisodio(50);

        System.out.println("deração para maratonar Lost: "+ lost.getDuracaoEmMinutos()+ " min");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);

        filtro.filtra(episodio);
    }
}