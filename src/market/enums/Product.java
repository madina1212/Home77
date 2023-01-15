package market.enums;

public enum Product {
    FISH(60), PASTA(50), APPLES(100), MEAT(120), POTATO(70), LEMON(40), BREAD(150);
    private double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
