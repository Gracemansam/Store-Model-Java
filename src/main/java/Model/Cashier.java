package Model;

import Interface.CashierDuty;
import Enum.CashierRole;

public class Cashier extends Staff implements CashierDuty {

    private String passCode;
    private String ExperienceLevel;

    private Product product;
    private CashierRole role;

    public Cashier(String passCode, String experienceLevel,CashierRole role) {
        super("Amanda", "Cashier");
        this.passCode = passCode;
        ExperienceLevel = experienceLevel.toLowerCase();
        this.role = role;
    }

    public String getPassCode() {
        return passCode;
    }

    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CashierRole getRole() {
        return role;
    }



    public String getExperienceLevel() {
        return ExperienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        ExperienceLevel = experienceLevel;
    }

    public void setRole(CashierRole role) {
        this.role = role;
    }

    /**
     * The cashier can only sell to the customer if the customer have purchasing power and if the cashier is
     * already employed.

     */
    @Override
    public String canSellAndGiveReceipt(Customer customer,Product product,Wallet wallet) {
        if(role == CashierRole.EMPLOYED ){
            if (product.getQuantity() != 0 && wallet.getBalance() > product.getTotalPrice()) {
                return "Thank you for your patronage, " + customer.getName() + " Here is your receipt";
            }

        }
        return "Hello " +customer.getName() + " You have not gotten any product from our store or You have Insufficient Fund ";

    }
}
