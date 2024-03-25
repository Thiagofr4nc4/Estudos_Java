package application;
import entities.Triangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite o valores de X");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Digite os valores de Y");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        double areaX = x.area();
        System.out.printf("A área de X é: %.4f%n", areaX);


        double areaY = y.area();
        System.out.printf("A área de X é: %.4f%n", areaY );

            if (areaY > areaX){
                System.out.printf("O Maior triangulo é: %.4f%n", + areaY);
            } else {
                System.out.printf("O Maior triangulo é: %.4f%n", + areaX);
            }

        }
    }
