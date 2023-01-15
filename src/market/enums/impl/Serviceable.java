package market.enums.impl;

import market.enums.Market;
import market.enums.person.Person;

import java.util.List;
import java.util.Scanner;

public interface Serviceable {
    void findByName(List<Market>markets,String name);
    void gedAllMarked(List<Market>markets);
    void findBayAddress(List<Market>markets,String address);
    void buyProducd(List<Market>markets,List<Person>personList);


    }
