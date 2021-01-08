/*
Oppgave 2
Nedenfor ser du en skisse for klassen Sirkel. Din oppgave er å erstatte skissen med java-instruksjoner. 
NB! Pass på at du velger riktig aksess-form (private eller public) for datafelt og metoder.
 */
package oblig1;

import static javax.swing.JOptionPane.*;


class Sirkel {
    private double sirkelensRadius; // Datafelt for sirkelens radius. 
    
    public Sirkel (double sirkelensRadius) { //Konstruktør som skal gi startverdi til sirkelens radius. NB! Hvis startverdien er negativ, skal radius settes til 0.
       setSirkelensRadius(sirkelensRadius);
    }
    
    public void setSirkelensRadius(double sirkelensRadius) { //Set-metode for sirkelens radius. NB! Hvis parameterverdien er negativ, skal radius settes til 0.
        if (sirkelensRadius < 0) {
            sirkelensRadius = 0;
        }
        this.sirkelensRadius = sirkelensRadius;
    }
    
    public double getSirkelensRadius() { // get-metode for sirkelens radius. 
        return sirkelensRadius;
    }

    public double beregnDiameter() { // Metode som beregner og returnerer sirkelens diameter.  
        double diameter = sirkelensRadius*2;
        return diameter;
    }

    public double beregnOmkrets() { // Metode som beregner og returnerer sirkelens omkrets.  
        double omkrets = (sirkelensRadius * 2) * 3.14;
        return omkrets;
    }
    
    public double beregnAreal() { // Metode som beregner og returnerer sirkelens areal.  
        double areal = 3.14 * sirkelensRadius * sirkelensRadius;
        return areal;
    }

    public String regnUt() { //Metode som returnerer en tekst som inneholder sirkelens radius, diameter, omkrets og areal. NB! Du SKAL bruke klassens metoder
               String ut = "Sirkelens radius: "+getSirkelensRadius()+"\n"+
                            "Sirkelens diameter: "+beregnDiameter()+"\n"+
                            "Sirkelens omkrets: "+beregnOmkrets()+"\n"+
                            "Sirkelens areal: "+beregnAreal()+"\n";
               return ut;
    }
} // slutt på class Sirkel



public class Oblig1 {

    public static void main(String[] args) {
        double sirkelensRadiusSum;
        double sirkelensRadius = 0;
        int antallSirkler = 0;
        String sirkelensRadiusInput;

        
        sirkelensRadiusInput = showInputDialog("Skriv inn en sirkels radius");
        sirkelensRadius = Double.parseDouble(sirkelensRadiusInput);
        Sirkel sirkel1 = new Sirkel(sirkelensRadius);
        if (sirkelensRadius > 0) {
            antallSirkler += 1;
        }  
        showMessageDialog(null, sirkel1.regnUt());
        
        sirkelensRadiusInput = showInputDialog("Skriv inn en ny sirkel sin radius");
        sirkelensRadius = Double.parseDouble(sirkelensRadiusInput);
        Sirkel sirkel2 = new Sirkel(sirkelensRadius);
        if (sirkelensRadius > 0) {
            antallSirkler += 1;
        }  
        showMessageDialog(null, sirkel2.regnUt());
        
        sirkelensRadiusInput = showInputDialog("Skriv inn enda en ny sirkel sin radius");
        sirkelensRadius = Double.parseDouble(sirkelensRadiusInput);
        Sirkel sirkel3 = new Sirkel(sirkelensRadius);
        if (sirkelensRadius > 0) {
            antallSirkler += 1;
        }  
        showMessageDialog(null, sirkel3.regnUt());
        
        /* Så lenge radius er positiv (inntil 3 objekter):
        Opprett et Sirkel-objekt, som ved opprettelsen blir tilført
        den radius som brukeren har skrevet inn.
        Summer radiusene ettehvert som de leses inn.
        Skriv sirkelens radius, diameter, omkrets og areal ut på skjermen
        ved å bruke en eller flere metoder i Sirkel-klassen.
        Les inn sirkelens radius på nytt fra brukeren. 
        Det skal opprettes inntil 3 objekter. Det skal ikke være nødvendig
        å bruke en løkke.*/
        
        /*if(sirkelensRadiusSum <= 0) { 
            showMessageDialog(null, "Det har ikke blitt lest inn noen verdier over 0");
        }*/
        
        sirkelensRadiusSum = sirkel1.getSirkelensRadius()+sirkel2.getSirkelensRadius()+sirkel3.getSirkelensRadius();
        if(sirkelensRadiusSum > 0) {
            double gjennomsnittRadius = sirkelensRadiusSum / antallSirkler;
            showMessageDialog(null, "Den gjennomsnittlige radiusen av sirklene er: "+gjennomsnittRadius);
        }
        else {
            showMessageDialog(null, "Det har ikke blitt lest inn noen verdier over 0");
        }
        /* Skriv ut den gjennomsnittelige radiusen for de innleste sirkelene.
        Hvis det ikke er lest inn noen skal programmet gi beskjed om det. */
    }
}// slutt på class SirkelTest


    

   
  
 


