package edu.ping.damian.comida;

public class Eyeholes extends Cereales{
    private String NOMBRE = "EyeHoles";
    private Float PVP = (float)25.0;

    public Eyeholes(){
        //serán objetos dinámicos no será estática esta clase
        //pero las propiedades están definidas por defecto
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
