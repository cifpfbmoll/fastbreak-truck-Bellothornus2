package edu.ping.damian.juguete;

public class Plumbus extends Juguete{
    private final String NOMBRE = "Plumbus";
    private final float PVP = (float) 50.0;

    public String nombre(){
        return this.NOMBRE;
    }
    public Float pvp(){
        return this.PVP;
    }
}
