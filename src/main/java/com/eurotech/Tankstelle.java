package com.eurotech;

import java.util.ArrayList;
import java.util.List;

public class Tankstelle {

    private int id;
    private String name;

    List<PreisObserver> preisObservers= new ArrayList<>();
    public Tankstelle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addObserver(PreisObserver preisObserver){
        preisObservers.add(preisObserver);
    }

    public void updateDisplay(){
        System.out.println("Neue preise sind aktualisiert");
        notifyPreisObserver();
    }

    private void notifyPreisObserver() {

        for (PreisObserver preisObserver: preisObservers){
            preisObserver.update(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
