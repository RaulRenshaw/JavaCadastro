import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner opcaousuario = new Scanner(System.in);

        boolean menu = true;

        System.out.print("Escolha quantos ninjas quer Cadastrar: ");
        int numeroNinjas = opcaousuario.nextInt();
        opcaousuario.nextLine(); // Consumir a linha residual
        String[] ninjas = new String[numeroNinjas];

       while (menu){
           System.out.println("\n===== Menu Ninja =====");
           System.out.println("1. Cadastrar Ninja");
           System.out.println("2. Listar Ninjas");
           System.out.println("3. deletar Ninja");
           System.out.println("4. Sair");
           System.out.print("Escolha uma opção: ");


           int escolhaMenu = opcaousuario.nextInt();
           opcaousuario.nextLine();

           switch (escolhaMenu) {
               case 1:
                   for (int i = 0; i < numeroNinjas; i++) {
                       System.out.print("Quem é o ninja?");
                       String ninja = opcaousuario.nextLine();
                       ninjas[i] = ninja;
                       System.out.println(ninjas[i]);
                   }
                   break;
               case 2:
                   if (ninjas[0] == null){
                      break;
                   }
                   for (String ninja : ninjas){
                       System.out.println(ninja);
                   }
                   break;
               case 3:
                   System.out.print("Qual ninja deseja remover? ");
                   String deletar = opcaousuario.nextLine();

                   for (int i = 0; i < ninjas.length; i++) {
                       if (ninjas[i].equals(deletar)) {
                           for (int j = i; j < ninjas.length - 1; j++) {
                               ninjas[j] = ninjas[j + 1];
                           }
                           ninjas[ninjas.length - 1] = null;
                           break;
                       }
                   }
                   break;

               case 4:
                   menu = false;
                   break;

               default:
                   System.out.print("nao valido");
           }
       }
   }
}
