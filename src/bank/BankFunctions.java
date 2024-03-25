package bank;
import java.util.Scanner;
public class BankFunctions {
    private  Scanner scanner = new Scanner(System.in);
    private String name;
    private String accountNumber;
    private Double balance;

    public BankFunctions(String name, String accountNumber, Double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankFunctions() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public Double getBalance() {
        return balance;
    }

    public void createAccount(){
        System.out.println("Digite seu nome: ");
        this.name = scanner.nextLine();
        System.out.println("Digite o número da conta: ");
        this.accountNumber = scanner.nextLine();
        this.balance = 0.0;
    }

    public boolean deposit(){
        System.out.println("Você deseja realizar um deposito? (S/N)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("S")) {
            return true;
        } else if (response.equalsIgnoreCase("N")) {
            return false;
        } else {
            System.out.println("Opção inválida. Por favor, digite S para sim ou N para não.");
            return false; // Ou você pode lançar uma exceção ou pedir novamente a entrada do usuário
        }
    }
    public void makeDeposit(){
        System.out.println("Digite o valor que deseja depositar: ");
        double depositAmount = scanner.nextDouble();
        this.balance += depositAmount;
        }
    public void makeWithdraw(){
        System.out.println("Digite o valor que deseja sacar:   ");
        System.out.println("Após digitado o valor do saque serão adicionados RS: 5,00 de taxa.");
        double withdrawalValue = scanner.nextDouble();
        this.balance -= (withdrawalValue+5);
    }

    public void viewBalance(Double balance){
        System.out.println("O Valor atual da sua conta é de: " + this.balance);
    }
}
