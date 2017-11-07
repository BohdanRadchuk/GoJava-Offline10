package store;

public class TechProduct extends SuperProduct<TechProduct> {
    private String description;
    private int guaranteeDuration;

    public TechProduct(String name, int price, String description, int guaranteeDuration) {
        super(name, price);
        this.description = description;
        this.guaranteeDuration = guaranteeDuration;
    }
}
