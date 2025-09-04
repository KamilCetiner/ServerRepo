package com.eurotech;

public class BenzinDisplayFeld implements PreisObserver{
    @Override
    public void update(Tankstelle tankstelle) {
        System.out.println("Benzin Display aktualisiert");
    }
}
