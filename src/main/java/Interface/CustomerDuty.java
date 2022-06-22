package Interface;

import Model.Product;
import Model.Wallet;

public interface CustomerDuty {
    String canBuy(Product product, Wallet wallet);
}
