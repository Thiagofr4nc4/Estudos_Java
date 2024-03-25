package Vetores;
import java.util.Scanner;
public class MediaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double [] vect = new double[n];
        for (int i =0; i<n; i++){
            vect[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        double media = sum / n;

        System.out.println("Média " + media);



        scanner.close();
    }
}
