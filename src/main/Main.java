package main;

import com.wolda.Bagger;
import com.wolda.Kleintransporter;
import com.wolda.Transporter;

public class Main {

    public static void main(String[] args) {
        Bagger b1 = new Bagger();
        Transporter t1 = new Transporter();
        Kleintransporter k1 = new Kleintransporter();

        b1.getInfos();
        t1.getInfos();
        k1.getInfos();

        t1.einausschalten();
        t1.fahren();
        b1.aufladen(t1);
    }
}
