package store;

public class FruitProuct extends SuperProduct<FruitProuct> {
    private int weight;

    public FruitProuct(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FruitProuct{" +
                "weight=" + weight +
                '}';
    }
}
