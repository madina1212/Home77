package market.enums;

import java.util.List;

public class Market {

    private String name;
    private String address;
    private List<Product> products;
    private  double BankAccound;

    public Market(String name, String address, List<Product> products, double bankAccound) {
        this.name = name;
        this.address = address;
        this.products = products;
        BankAccound = bankAccound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getBankAccound() {
        return BankAccound;
    }

    public void setBankAccound(double bankAccound) {
        BankAccound = bankAccound;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", products=" + products +
                ", BankAccound=" + BankAccound +
                '}';
    }
}
