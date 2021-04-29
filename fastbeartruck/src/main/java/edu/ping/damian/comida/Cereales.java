package edu.ping.damian.comida;

public class Cereales implements Item {
    Cereales(){}

    public Packing empaquetado(){
        Packing packing = new Caja();
        return packing;
    }

    public String toString(){

    }
}
