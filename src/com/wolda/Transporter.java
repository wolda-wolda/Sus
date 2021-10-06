package com.wolda;

public class Transporter extends Fahrzeuge {
    private int Gewichtlimit = 0;
    private int vorhanden = 1;

    public Transporter() {
        super("Blau", 3000, "Transporter");
    }

    public Transporter(String farbe, int gewicht, String name) {
        super(farbe, gewicht, name);
    }

    public void geroellabtransportieren() {
        this.Gewichtlimit = 0;
        this.vorhanden = 1;
        super.Tankfuellung-=50;
    }

    public void setGewichtlimit(int gewichtlimit) {
        Gewichtlimit = gewichtlimit;
    }

    public void geroellladen() {
        if (this.Gewichtlimit == 0 && this.vorhanden != 0 && super.Tankfuellung!= 0 && super.isEin()) {
            this.vorhanden = 0;
            super.Tankfuellung-=50;
        } else if(super.Tankfuellung==0){
            System.out.println("Tank ist leer");
        } else{
            System.out.println("Ich bin schon voll");
        }
    }
}
