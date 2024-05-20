package vetoresExercicios;
import java.util.Scanner;

public class ExercicoNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de elementos do vetor");
        int n = scanner.nextInt();
        double[] num = new double[n];

        for (int i=0; i< num.length; i++){
            System.out.println("Digite um número: ");
            num[i] = scanner.nextDouble();
        }
        System.out.println("Números negativos: ");
        for (int i=0; i< num.length; i++){
            if (num[i] < 0){
                System.out.println(num[i]);
            }
        }
    }
}
