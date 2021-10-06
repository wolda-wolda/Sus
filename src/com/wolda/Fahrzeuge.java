package com.wolda;

public abstract class Fahrzeuge {
    private String name;
    private String Farbe;
    private int gewicht;
    protected int Tankfuellung = 100;
    private boolean ein = false;
    private boolean fahren = false;

    public Fahrzeuge(String farbe, int gewicht, String name) {
        this.Farbe = farbe;
        this.gewicht = gewicht;
        this.name = name;
    }

    public void tanken() {
        if (this.Tankfuellung < 100) {
            this.Tankfuellung = 100;
        } else {
            System.out.println("Schon vollgetankt");
        }
    }

    public void fahren() {
        if (this.Tankfuellung>0 && this.fahren==false && this.ein==true){
            System.out.println("Ich fahre");
            this.fahren=true;
        }else if(this.Tankfuellung==0){
            System.out.println("Bitte Tanken");
            this.fahren=false;
        }else {
            this.fahren=false;
        }
    }

    public void einausschalten() {
        if (this.ein == true) {
            this.ein = false;
        } else {
            this.ein = true;
        }
    }

    public boolean isEin() {
        return ein;
    }

    public void getInfos() {
        System.out.println(this.name + " " + this.Farbe + " " + this.gewicht + " " + this.Tankfuellung);
    }
}
