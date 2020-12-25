//*******************************************************************
//  class Meunze
//  *wert der Muenze ist in Euro
//  *anzahl ist die Nummer von Muenzen mit einem bestimmten Wert
//*******************************************************************
package kasse;

public class Muenze {

    private double wert;
    private int anzahl;

    public Muenze(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

}
