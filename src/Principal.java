//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {



    Filme meuFilme = new Filme();

    meuFilme.nome = "O poderoso chefao";
    meuFilme.anoDeLancamento = 1970;
    meuFilme.duracaoEmMinutos = 180;

   meuFilme.exibeFichaTecnica();
   meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    System.out.println(meuFilme.somaDasAvaliacoes);
    System.out.println(meuFilme.totalDeAvaliacoes);


    System.out.println(meuFilme.pegaMedia());
}
