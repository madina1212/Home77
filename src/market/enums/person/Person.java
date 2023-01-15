package market.enums.person;

import market.enums.Gender;
import market.enums.Market;
import market.enums.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Person {
    private String name;
    private  int age;
    private Gender gender;
    private double money;
    private List<Product> productList;

    public Person(String name, int age, Gender gender, double money, List<Product> productList) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", money=" + money +
                ", productList=" + productList +
                '}';
    }
}
