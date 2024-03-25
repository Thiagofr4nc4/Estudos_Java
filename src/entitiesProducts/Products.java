package entitiesProducts;
import java.util.Scanner;

public class Products {
    Scanner scanner = new Scanner(System.in);
    String name;
    int quantity;
    double price;

    public String addName(){
        System.out.println("Digite o nome do produto: ");
        String name = scanner.nextLine();
        return name;
    }

    public int addQuantity(){
        System.out.println("Informe a quantia de produtos que deseja adicionar: ");
        int add = scanner.nextInt();
        quantity += add;
        return quantity;
    }

    public double addPrice(){
        System.out.println("Digite o preço unitário do produto: ");
        double price = scanner.nextDouble();
        return price;
    }

    public double totalValue(int quantity, double price){
        double value = quantity * price;
        return value;
    }

    public void dataProducts(String productName, int productQuantity, double productTotalValue){
        System.out.println("Nome de produto: " + productName + "\nQuantidade: " + productQuantity + "\nValor total: " + productTotalValue);
    }

    public double remove (int quantity){
        System.out.println("Digite a quantidade de produtos que deseja remover: ");
        int removeProduct = scanner.nextInt();
        quantity -= removeProduct;
        return quantity;
    }
}
