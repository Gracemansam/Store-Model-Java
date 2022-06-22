package Model;

public class Product {
    private float price;
    private String productName;

    private int quantity;

    public Product(float price, String productName, int quantity) {
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotalPrice(){
        float totalPrice = getPrice() * getQuantity();
        return totalPrice;
    }
}
