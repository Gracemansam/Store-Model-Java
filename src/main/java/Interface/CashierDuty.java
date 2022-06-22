package Interface;

import Model.Customer;
import Model.Product;
import Model.Wallet;

public interface CashierDuty {
    String canSellAndGiveReceipt(Customer customer, Product product, Wallet wallet);
}
