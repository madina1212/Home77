package market.enums.impl;

import market.enums.Market;
import market.enums.Product;
import market.enums.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serviceimpl implements Serviceable{
private List<Market> newMarked = new ArrayList<>();

    @Override
    public void findByName(List<Market> markets, String name) {
        List<Market> newMarked = new ArrayList<>();
        for (Market market : markets) {
            if (market.getName().equals(name)){
                newMarked.add(market);
                System.out.println(newMarked);
            }

        }
    }

    @Override

    public void gedAllMarked(List<Market>marketLis) {
        for (Market marketLi : marketLis) {
            System.out.println(marketLi);
        }
        }




    @Override
    public void findBayAddress(List<Market> markets, String address) {
        for (Market market : markets) {
            if (market.getAddress().equals(address)){
                System.out.println(market);
            }

        }

    }

    @Override
    public void buyProducd(List<Market> markets, List<Person> personList) {
        List<Product>bug=new ArrayList<>();
        System.out.println("Markedke kim barad");
        String name = new Scanner(System.in).nextLine();
        for (Person person : personList) {
            if (person.getName().equals(name)){
                System.out.println("kaisy markedge barabyz");
                String markedName = new Scanner(System.in).nextLine();
                for (Market market : markets) {
                    if (market.getName().equals(markedName)){
                        System.out.println("kaisy praducdany alabyz");
                        String prodakName = new Scanner(System.in).nextLine();
                        bug.add(Product.valueOf(prodakName));
                        for (Product product : bug) {
                            double v = person.getMoney() - product.getPrice();
                            market.setBankAccound(v);
                        }

                    }

                }
            }

        }
    }
}
