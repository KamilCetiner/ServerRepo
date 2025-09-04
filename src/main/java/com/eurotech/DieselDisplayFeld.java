package com.eurotech;

public class DieselDisplayFeld implements PreisObserver{
    @Override
    public void update(Tankstelle tankstelle) {
        System.out.println("Diesel Display aktualisiert");
    }
}
