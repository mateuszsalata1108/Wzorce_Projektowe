package com.company;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Audi", 2001, 250000);
        Auto auto2 = new Auto("Volkswagen", 1998, 450000);
        Auto auto3 = new Auto("Nissan", 2010, 100000);

        auto1.klonuj();
        auto2.klonuj();

        System.out.println("Przebieg auta 'auto3' " + auto3.getPrzebieg());
        auto3.setPrzebieg(120000);
        System.out.println("Przebieg auta 'auto3' " + auto3.getPrzebieg());
    }
}
