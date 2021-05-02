package edu.ping.damian.juguete;

import edu.ping.damian.Caja;
import edu.ping.damian.Item;
import edu.ping.damian.Packing;

public abstract class Juguete implements Item{
    Juguete(){}
    
    public Packing empaquetado(){
        return new Caja();
    }
}
