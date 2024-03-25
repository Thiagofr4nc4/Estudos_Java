package valor_dollar;
import java.util.Scanner;
public class converter {
    Scanner scanner = new Scanner(System.in);
    public Double dollarHoje(){
        System.out.printf("Informe o valor da cotação do Dollar Hoje: ");
        double dollar = scanner.nextDouble();
        return dollar;
    }

    public Double comprarDollar(){
        System.out.printf("Informe a quantia que deseja comprar: ");
        double quantiaDollar = scanner.nextDouble();
        return quantiaDollar;
    }

    public Double total(double dollar, double quantiaDollar){
        double valorTotal = 0;
        double imposto = 0.06;
        valorTotal += dollar * quantiaDollar * (1 + imposto);
        System.out.printf("O valor total da compra foi de: %.2f já incluído o imposto de %.2f%% IOF.%n", valorTotal, imposto*100);
        return valorTotal;
    }
}
