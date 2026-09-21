import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {



    Filme meuFilme = new Filme("O poderoso chefao", 1970);
    meuFilme.setDuracaoEmMinutos(180);
   meuFilme.exibeFichaTecnica();
   meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);


    System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
    System.out.println(meuFilme.pegaMedia());


    Serie lost = new Serie("Lost",2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duracao para maratonar Lost: " + lost.getDuracaoEmMinutos());

    Filme outroFilme = new Filme("Avatar", 2010);
    outroFilme.setDuracaoEmMinutos(200);



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
    episodio.setTotalVisualizacoes(300);
    filtro.filtra(episodio);




    // Inferencia de Tipo usando o var!
    var filmeDoPaulo = new Filme("Dogville", 2003);
    filmeDoPaulo.setDuracaoEmMinutos(200);
    filmeDoPaulo.avalia(10);

    ArrayList<Filme> listaDeFilmes = new ArrayList<>();

    listaDeFilmes.add(filmeDoPaulo);
 listaDeFilmes.add(meuFilme);
 listaDeFilmes.add(outroFilme);
 System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
 System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
 System.out.println(listaDeFilmes);
}
