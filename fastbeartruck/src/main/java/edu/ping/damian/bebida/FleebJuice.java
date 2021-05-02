package edu.ping.damian.bebida;

public class FleebJuice extends Bebida{
    private final String NOMBRE = "FleebJuice";
    private final Float PVP = (float)25.0;
    
    public FleebJuice(){
        //
    }
    @Override
    public String nombre(){
        return this.NOMBRE;
    }
    @Override
    public Float pvp(){
        return this.PVP;
    }
}
