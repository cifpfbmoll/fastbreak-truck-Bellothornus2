package edu.ping.damian;

import java.util.ArrayList;
import java.util.List;

public class Desayuno {
    private Float total = (float) 0.0;
    private ArrayList<Item> listItems = new ArrayList<Item>();

    Desayuno(){}

    public List<Item> getItems(){
        return this.listItems;
    }

    public Float getCoste(){
        for (Item item : this.getItems()) {
            this.total += item.pvp();
        }
        return this.total;
    }
    public void addItem(Item item){
        this.getItems().add(item);
    }

    public void mostrarItems(){
        for (Item item : this.getItems()) {
            System.out.print("Hay este item: " + item.nombre() + " ");
        }
    }
    
}
