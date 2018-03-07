package com.company;

import java.util.ArrayList;

public class Samochod implements ISavable {
    private String marka;
    private String model;
    private String kolor;

    public Samochod(String marka, String model, String kolor) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> samochodTablica = new ArrayList<String>();
        samochodTablica.add(this.marka.toString());
        samochodTablica.add(this.model.toString());
        samochodTablica.add(this.kolor.toString());
        return samochodTablica;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        this.marka = savedValues.get(0);
        this.model = savedValues.get(1);
        this.kolor = savedValues.get(2);
    }

    @Override
    public String toString() {
        return "Marka: " + this.marka + "; Model: " + this.model + "; Kolor: " + this.kolor;
    }
}
