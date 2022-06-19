package com.company;

public class Auto extends Prototyp {

    public Auto(String model, int rokProdukcji, int przebieg) {
        super(model, rokProdukcji, przebieg);
    }

    @Override
    public Prototyp klonuj(){
        System.out.println("Sklonowano nowe auto: " + "\n" + "Model: " + model + "\n" + "Rok produkcji: " + rokProdukcji + "\n" + "Przebieg: " + przebieg + "km" );
        return new Auto(model, rokProdukcji, przebieg);
    }
}
