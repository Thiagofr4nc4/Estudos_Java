package vetores;
import java.util.Scanner;


public class Produtos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos do vetor: ");
        int n = scanner.nextInt();
        Products[] vect = new Products[n];

        for (int i=0; i<n; i++){
            scanner.nextLine();
            System.out.println("Digite o nome do produto");
            String name = scanner.nextLine();
            System.out.println("Digite o valor do produto");
            double price = scanner.nextDouble();
            vect[i] = new Products(name, price);
        }

        double sum =0;

        for (int i=0; i<n; i++){
            sum += vect[i].getPrice();
        }

        double media = sum / n;

        System.out.println("Média dos produtos: " + media);

        scanner.close();
    }
}
