package store;

public class AnimalProduct extends SuperProduct<AnimalProduct> {
    private int age;

    public AnimalProduct(String name, int price, int age) {
        super(name, price);
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimalProduct{" +
                "age=" + age +
                '}';
    }
}
