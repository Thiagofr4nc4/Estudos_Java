package vetoresExercicios;
import java.util.Scanner;
public class ExercicioSomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =0;
        System.out.println("Digite o numero de elementos do vetor: ");
        n = scanner.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Digite um número: ");
            vetorA[i] = scanner.nextInt();

        }
        System.out.println("Agora digite os valores do vetor B: ");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.println("Digite um número: ");
            vetorB[i] = scanner.nextInt();

        }
        for (int i = 0; i < vetorA.length ; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("Valor resultante: ");
        for (int i = 0; i < vetorC.length ; i++) {
            System.out.println(vetorC[i]);

        }
    }
}
