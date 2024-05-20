package vetoresExercicios;
import java.util.Scanner;
public class ExercicioPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o número de elementos do vetor: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero:");
            vetor[i] = scanner.nextInt();
        }
        int quantiaPares = 0;
        System.out.println("Numeros pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 ==0 ) {
                quantiaPares += 1;
                System.out.print(vetor[i] + " ");


            }

        }
        System.out.println();
        System.out.println("Quantia pares: " + quantiaPares);
        scanner.close();
    }
}
