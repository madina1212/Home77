import com.sun.source.doctree.SummaryTree;
import market.enums.Gender;
import market.enums.Market;
import market.enums.Product;
import market.enums.impl.Serviceimpl;
import market.enums.person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(Product.APPLES, Product.BREAD, Product.PASTA, Product.MEAT, Product.LEMON, Product.POTATO));
        Person person2 = new Person("Alina", 16, Gender.FAMALE, 1000, null);
        Person person = new Person("Begimjan", 23, Gender.FAMALE, 2000, null);
        Person person1 = new Person("Asel", 35, Gender.FAMALE, 5000, null);
        Person person3 = new Person("Aijan", 19, Gender.FAMALE, 8000, null);
        List<Person> personList = new ArrayList<>(Arrays.asList(person1, person2, person3, person));

        Market market = new Market("Globus", "Alamidin", products, 2000.0);
        Market market2 = new Market("Frunze", "Vasko5", products, 4000.0);
        Market market1 = new Market("Narodnyi", "SUM", products, 5000.0);
        List<Market> markets = new ArrayList<>(Arrays.asList(market, market1, market2));
        Serviceimpl serviceimpl = new Serviceimpl();
        while (true) {
            System.out.println("""
                    1.find Bay Address
                    2. Fin By Name
                    3. buy Producd
                    4.gedAll Marked
                    """);
            int number = new Scanner(System.in).nextInt();
            if (number == 1) {
                serviceimpl.findBayAddress(markets, "SUM");
            } else if (number==2) {
                serviceimpl.findByName(markets, "Globus");
            } else if (number == 3) {
                serviceimpl.buyProducd(markets, personList);
            } else if (number==4) {
                serviceimpl.gedAllMarked(markets);
            } else {
                System.out.println("mynday san jok");


            }


        }
    }
    }