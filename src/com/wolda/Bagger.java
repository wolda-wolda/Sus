package com.wolda;

public class Bagger extends Fahrzeuge{
    public Bagger(){
        super("Orange", 9000, "Bagger");
    }
    public void aufladen(Transporter t){
        t.setGewichtlimit(14);
    }
}
