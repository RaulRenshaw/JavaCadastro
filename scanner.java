import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner caixadetexto = new Scanner(System.in);

        String novoninja = caixadetexto.nextLine();
        System.out.println(novoninja);

        int idade = caixadetexto.nextInt();
        if (idade>15){
            System.out.println("apto a fazer a missao");
        }else {
            System.out.println("inapto a fazer a missao");
        }
        caixadetexto.close();
    }
}
