package Model;

import Interface.CustomerDuty;

public class Customer extends Person implements CustomerDuty {

    private String nameOfProduct;
    private int quantityOfProduct;

    private Product product;

    private Wallet wallet;

    public Customer(String name, String nameOfProduct, int quantityOfProduct) {
        super(name, "Customer");
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;

    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    /**
     * Customer can only buy,if his/her wallet balance is not equal to zero and the wallet balance is greater than
     * the product total price.
     *
     *
     */
    @Override
    public String canBuy(Product product, Wallet wallet) {
        if (wallet.getBalance() != 0 && wallet.getBalance() > product.getTotalPrice()) {
            return "My name is " + getName() + " and I just bought " + product.getProductName() + " from your store";
        }
        return "I don't have money today, Just sight shopping. ";
    }
}
