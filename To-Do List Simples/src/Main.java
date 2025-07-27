import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> atividades = new ArrayList<String>();

        Scanner caixaDeTexo = new Scanner(System.in);

        while (true) {
            System.out.println("To-DO List simples");
            System.out.println("");

            System.out.println("""
                    ____________Menu__________
                    [ 1 ] Adicionar atividade 
                    [ 2 ] Remover ultima ativitade
                    [ 3 ] Remover primeira ativitade
                    [ 4 ] Ver atividades
                    [ 5 ] Sair
                    """);
            int opcao = caixaDeTexo.nextInt();

            if (opcao == 5) break;
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                System.out.println("Opção invalida tente de novo");
                continue;
            };

            switch (opcao) {
                case 1 :
                    System.out.println("qual o name da atividade: ");
                    atividades.add(caixaDeTexo.next());
                    System.out.println("Atividade adicionada com sucesso.");
                    break;
                case 2:
                    atividades.removeLast();
                    System.out.println("Atividade removida com sucesso.");
                    break;
                case 3:
                    atividades.removeFirst();
                    System.out.println("Atividade removida com sucesso.");
                    break;
                case 4:
                    System.out.println(atividades);
                    break;
                default:
                    System.out.println("opaçãp invalida");
            }
        }
    }
}