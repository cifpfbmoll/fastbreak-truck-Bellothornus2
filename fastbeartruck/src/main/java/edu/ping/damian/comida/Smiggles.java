package edu.ping.damian.comida;

public class Smiggles extends Cereales{
    private String NOMBRE = "Smiggles";
    private Float PVP = (float)25.0;

    public Smiggles(){
        //serán objetos dinámicos no será estática esta clase
        //pero las propiedades están definidas por defecto
    }

    public String nombre(){
        return this.NOMBRE;
    }

    public Float pvp(){
        return this.PVP;
    }
}

