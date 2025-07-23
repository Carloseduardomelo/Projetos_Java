import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner CaixaDeTexto = new Scanner(System.in); // Criando um novo Scaner

        while (true){
            System.out.println("________________Calculadora Basica do Senpai________________");// Menu da Calculadora.
            System.out.println("");
            System.out.println("""
                    ------------Escola as Opcções-----------
                    [ 1 ] Adição
                    [ 2 ] Multiplicação
                    [ 3 ] Subitração
                    [ 4 ] Divição
                    [ 5 ] Sair da Calculadora
                    """);
            int opacaoMenu = CaixaDeTexto.nextInt();// Pegando o valor da opção

            if (opacaoMenu == 5) {
                break;
            }

            System.out.println("Digide o Primero Valor:1");
            int valor01 = CaixaDeTexto.nextInt(); // Pegando o primeiro valor para fazer o calculo
            if (valor01 == 0){
                System.out.println("Os valores tem que ser maior que zero");
                continue;
            }

            System.out.println("Digide o segundo Valor:");
            int valor02 = CaixaDeTexto.nextInt(); // Pegando o segundo valor para fazer o calculo
            if (valor02 == 0){
                System.out.println("Os valores tem que ser maior que zero");
                continue;
            }

            switch (opacaoMenu) {

                case 1:
                    System.out.println("A adição entre: " +  valor01 + " + " + valor02 + " e: " + (valor01 + valor02));
                    break;
                case 2:
                    System.out.println("A adição entre: " +  valor01 + " * " + valor02 + " e: " + (valor01 * valor02)  );
                    break;
                case 3:
                    System.out.println("A adição entre: " +  valor01 + " - " + valor02 + " e: " + (valor01 - valor02)  );
                    break;
                case 4:
                    System.out.println("A adição entre: " +  valor01 + " / " + valor02 + " e: " + (valor01 / valor02)  );
                    break;
                default:
                    System.out.println("Essa opoção não e valida");
            }
        }
    }
}