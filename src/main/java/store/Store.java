package store;

import java.util.ArrayList;

public class Store<T> {
    private String name;
    private String address;
    private ArrayList<T> fruitStore;




    public Store(String name, String address, ArrayList<T> products) {
        this.name = name;
        this.address = address;
        fruitStore = products;/*
        this.techStore = techProducts;
        this.animalStore = animalProducts;
    */}

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fruitStore=" + fruitStore +
                '}';
    }
}
