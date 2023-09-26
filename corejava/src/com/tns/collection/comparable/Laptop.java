package com.tns.collection.comparable;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private int ram;
    private int price;

    // Constructors
    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Laptop otherLaptop) {
        // Compare laptops based on price
        return Integer.compare(this.price, otherLaptop.price);
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
    }
}
