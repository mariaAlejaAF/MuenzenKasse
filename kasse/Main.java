package kasse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] euroWerten = {2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        Kasse myKasse = new Kasse(euroWerten);

        try {
            
        System.out.print("Willkommen zur Kasse\nBitte geben Sie das Wechselgeld in Euro ein: ");
        double wechselGeld = scan.nextDouble();
        myKasse.calculMuenzenWechselgeld(wechselGeld);
        
        } catch (Exception e) {
            System.out.println("Wechselgeld muss numeric und mit Komma sein");
        }
        

    }
    
    
}
