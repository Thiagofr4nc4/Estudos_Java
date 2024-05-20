package agenda;
import java.util.Scanner;

public class testeAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o nome do numero: ");
        String numero = scanner.nextLine();
        System.out.println("Digite o nome do endereco: ");
        String endereco = scanner.nextLine();

        Agenda agenda = new Agenda(nome, numero, endereco);
        System.out.println(agenda);

    }
}
