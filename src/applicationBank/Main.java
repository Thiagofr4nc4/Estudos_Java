package applicationBank;
import bank.*;
public class Main {

    public static void main(String[] args) {
      BankFunctions bank  = new BankFunctions();
      bank.createAccount();
      bank.deposit();
      bank.makeDeposit();
      bank.makeWithdraw();
      bank.viewBalance(bank.getBalance());
      bank.income();

    }
}
