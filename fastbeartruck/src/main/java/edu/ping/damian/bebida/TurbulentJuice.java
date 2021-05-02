package edu.ping.damian.bebida;

public class TurbulentJuice extends Bebida{
    private final String NOMBRE = "TurbulentJuice";
    private final Float PVP = (float) 32.0;
    
    public TurbulentJuice(){
        //
    }

    public String nombre(){
        return this.NOMBRE;
    }
    public Float pvp(){
        return this.PVP;
    }
}
