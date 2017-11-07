package store;

public class Company {

    public Store animalStore;
    public Store techStore;
    public Store fruitStore;

    public Company(Store fruitStore,Store animalStore, Store techStore) {
        this.fruitStore = fruitStore;
        this.animalStore = animalStore;
        this.techStore = techStore;
    }

    @Override
    public String toString() {
        return "Company{" +
                "fruitStore=" + fruitStore +
                ", animalStore=" + animalStore +
                ", techStore=" + techStore +
                '}';
    }
}
