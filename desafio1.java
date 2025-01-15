public class desafio1 {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        int idade = 18;
        String missao = "protecaodavila";
        char dificuldadeDaMissao = 's';
        String statusdamissao;

        if (idade >= 15){
            System.out.println(nome);
            System.out.println(idade);
            System.out.println(missao);
            System.out.println(dificuldadeDaMissao);

            statusdamissao = "concluida";
            System.out.println(statusdamissao);
        } else if (idade < 15 && dificuldadeDaMissao == 'c' || dificuldadeDaMissao == 'd'){
            statusdamissao = "concluida";

            System.out.println(nome);
            System.out.println(idade);
            System.out.println(missao);
            System.out.println(dificuldadeDaMissao);
            System.out.println(statusdamissao);
        }else {
            statusdamissao = "nao concluida";

            System.out.println(nome);
            System.out.println(idade);
            System.out.println(missao);
            System.out.println(dificuldadeDaMissao);
            System.out.println(statusdamissao + " a missao é mais dificil doq a idade permite");
        }
    }
}
