package Model;
import Enum.CashierRole;

public class Main {
    public static void main(String[] args) {

      Manager manager = Manager.getInstance();
      Cashier cashier = new Cashier("cashier123@","intermediate", CashierRole.APPLICANT);
      Customer customer = new Customer("Alex","Bread",2);
      Product product = new Product(30,"Bread",2);
      Wallet wallet = new Wallet(1000);
      //Wallet balance can be assigned here
      System.out.println(manager.canHireCashier(cashier)); //Manager role
      System.out.println(cashier.canSellAndGiveReceipt(customer,product, wallet)); // Cashier role
      System.out.println(customer.canBuy(product,wallet)); // Customer Role.
    }
}