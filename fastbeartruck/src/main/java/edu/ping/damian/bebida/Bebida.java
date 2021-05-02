package edu.ping.damian.bebida;

import edu.ping.damian.Item;
import edu.ping.damian.Packing;
import edu.ping.damian.Tubo;

public abstract class Bebida implements Item{
    public Bebida(){
        //
    }
    public Packing empaquetado(){
        Packing empaquetado = new Tubo();
        return empaquetado;
    }

    @Override
    public String toString(){
        return "Bebida, yo que sé";
    }
}
