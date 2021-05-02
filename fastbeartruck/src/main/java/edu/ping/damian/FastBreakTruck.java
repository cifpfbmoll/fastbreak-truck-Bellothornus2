package edu.ping.damian;

import edu.ping.damian.bebida.FleebJuice;
import edu.ping.damian.bebida.TurbulentJuice;
import edu.ping.damian.comida.Eyeholes;
import edu.ping.damian.comida.Smiggles;
import edu.ping.damian.juguete.Plumbus;

public class FastBreakTruck {
    FastBreakTruck(){}

    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());
        return desayuno;
    }
    public static void incluirJuguete(Desayuno desayuno){
        desayuno.addItem(new Plumbus());
    }
}
