package applicationProducts;
import entitiesProducts.*;

public class Main {

    public static void main(String[] args){

        Products product = new Products();

        String productName = product.addName();
        int productQuantity = product.addQuantity();
        double productPrice = product.addPrice();
        double productTotalValue = product.totalValue(productQuantity, productPrice);


        product.dataProducts(productName, productQuantity, productTotalValue);

    }
}
