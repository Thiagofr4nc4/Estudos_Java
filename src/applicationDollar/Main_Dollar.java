package applicationDollar;
import valor_dollar.*;
public class Main_Dollar {

    public static void main(String[] args) {

        converter dollarConverter = new converter();

        double cotacaoDollar = dollarConverter.dollarHoje();

        double quantiaDollar = dollarConverter.comprarDollar();

        double valorTotal = dollarConverter.total(cotacaoDollar, quantiaDollar);


    }
}
