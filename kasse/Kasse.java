//*******************************************************************
//  class Kasse
//  *Diese Klasse hat eine array mit den Muenzwerten, eine mit den
//   Muenzen und die und die Gesamtzahl von Muenztypen
//  *bestimmt die geringste Menge an Muenzen benoetigt, um das Wechselgeld
//   zurück zu geben
//*******************************************************************
package kasse;

public class Kasse {

    private double[] muenzWerten;
    private Muenze arrayMuenzen[];
    private int anzahlMuenztypen;

    public Kasse(double[] muenzWerten) {
        this.muenzWerten = muenzWerten;
        this.anzahlMuenztypen = muenzWerten.length;
    }

    private void initArrayMuenzen() {
        arrayMuenzen = new Muenze[anzahlMuenztypen];
        for (int i = 0; i < anzahlMuenztypen; i++) {
            arrayMuenzen[i] = new Muenze(muenzWerten[i]);
        }
    }
    
    //überprüft, ob das Wechselgeld mit einer bestimmten Muenze gegeben werden kann,
    //rechnen die Anzahl von dieser Muenzen und aktualisiert den Wert von Wechselgeld
    private void calculateAnzahlMuenzen(double wechselGeld) {
        int indexMuenzen = 0;
        while (wechselGeld > 0) {
            if (wechselGeld >= muenzWerten[indexMuenzen]) {
                wechselGeld = erhoeheAnzahl(wechselGeld, indexMuenzen);
            }
            indexMuenzen++;
        }
    }
    //erhöht die Anzahl der Muenzen mit einem bestimmten Wert und gibt den neuen
    //Wert von Wechselgeld zurueck
    private double erhoeheAnzahl(double wechselGeld, int indexMuenzen) {

        int anzahl = (int) (wechselGeld / muenzWerten[indexMuenzen]);
        arrayMuenzen[indexMuenzen].setAnzahl(anzahl);
        wechselGeld = Math.round((wechselGeld % muenzWerten[indexMuenzen]) * 100.0) / 100.0;

        return wechselGeld;
    }
    
    private void gibMuenzen(double wechselGeld) {
        System.out.println("Für das Wechselgeld " + wechselGeld + " braucht man:\n");
        for (Muenze munze : arrayMuenzen) {
            System.out.println(" \t" + munze.getAnzahl() + " Muenzen von " + munze.getWert() + " Euro");
        }
    }
    
    public void calculateMuenzenWechselgeld(double wechselGeld){
        initArrayMuenzen();
        calculateAnzahlMuenzen(wechselGeld);
        gibMuenzen(wechselGeld);
    
    }

}
