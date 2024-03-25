package Vetores_Exercicios;
import java.util.Scanner;
public class ExercicioMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =0;
        System.out.println("Digite o número de elementos do vetor: ");
        n = scanner.nextInt();
        double[] vetor = new double[n];
        double somaVetor = 0;

        for (int i = 0; i < vetor.length ; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = scanner.nextDouble();
            somaVetor += vetor[i];
        }
        double mediaVetor = somaVetor/vetor.length;

        System.out.println("A média é =  " + mediaVetor);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i <vetor.length ; i++) {
            if (vetor[i] <mediaVetor ){
                System.out.println(vetor[i]);
            }

        }
    }
}
