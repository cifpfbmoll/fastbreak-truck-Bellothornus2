package edu.ping.damian.comida;

import edu.ping.damian.Caja;
import edu.ping.damian.Item;
import edu.ping.damian.Packing;

public abstract class Cereales implements Item {
    Cereales(){}
    
    public Packing empaquetado(){
        Packing packing = new Caja();
        return packing;
    }
    public String toString(){
        return "Cereales, yo que sé";
    }
}
