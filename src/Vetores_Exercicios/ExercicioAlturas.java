package Vetores_Exercicios;
import java.util.Scanner;
public class ExercicioAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos do vetor: ");
        int n = scanner.nextInt();
        String[] nomes = new String[n];
        int[] idade = new int[n];
        Double[] altura = new Double[n];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome:");
            nomes[i] = scanner.next();
        }
        for (int i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade: ");
            idade[i] = scanner.nextInt();
        }
        for (int i = 0; i < altura.length; i++) {
            System.out.println("Digite a altura: ");
            altura[i] = scanner.nextDouble();
        }

        double somaAltura = 0;
        for (int i = 0; i < altura.length; i++) {
            somaAltura += altura[i];
        }
        double mediaAltura = somaAltura / altura.length;
        System.out.println("A média das alturas é de: " + mediaAltura);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {

                System.out.println(nomes[i]);

                scanner.close();
            }
        }

    }
}
