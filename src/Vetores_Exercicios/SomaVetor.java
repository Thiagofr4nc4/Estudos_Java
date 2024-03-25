package Vetores_Exercicios;
import java.util.Scanner;
public class SomaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do vetor");
        int n = scanner.nextInt();
        double[] num = new double[n];

        for (int i=0; i< num.length; i++){
            System.out.println("Digite um número: ");
            num[i] = scanner.nextInt();
        }
        System.out.print("Valores: ");
        for (int i=0; i < num.length; i++){
            System.out.print(num[i] + " " );
        }
        System.out.println();
        double soma =0;

        for (int i=0; i < num.length; i++){
            soma += num[i];
        }
        System.out.println("Soma: " + soma);

        double media = soma / num.length;
        System.out.println("Media: " + media);


    }

}
