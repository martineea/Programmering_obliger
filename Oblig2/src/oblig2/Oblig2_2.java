/*
Oppgave 2 - Tallspill
Det skal brukes javax.swing sine input- og meldings-bokser i denne oppgaven.

Du får som oppgave å lage et program for et tallspill. Spillet skal kunne kjøres gjentatte runder 
inntil spilleren velger å avslutte. For hver runde skal programmet foreta følgende:

Programmet skal generere et tilfeldig helt tall (slumptall) mellom 0 og 200 (ingen av grensene inkludert). 
Spilleren skal prøve å gjette på dette tallet. For hver gjetning, som foretas ved at det vises en slik innlesingsboks:
*/

package oblig2;


import static javax.swing.JOptionPane.*;

class Tallspill {
    private int tall;
    
    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), random-metoden gir verdier mellom 0 og 1
        int tall = (int) (Math.random() * 201);
        //System.out.print(tall);
        return tall;
    }

    /*public void visMelding(int tall){
        // Viser parameterens innhold i en meldingsboks. 
    }*/

    private void forLite( int tall ){
      /* Viser melding om at parameterens verdi er for
         lite tall og ber spilleren prøve igjen. */
          showMessageDialog(null, tall+" er for lite! Prøv igjen!");
    }

    private void forStort( int tall ) {
      /* Viser melding om at parameterens verdi er for
        stort tall og ber spilleren prøve igjen. */
          showMessageDialog(null, tall+ " er for stort! Prøv igjen!");
    }

    public void avsluttRunde( int antall, int gjetning ) {
      /* Viser melding om at det ble gjettet riktig
        og antall gjetninger som ble brukt.
        Parametrene gir opplysninger om dette. */
        showMessageDialog(null, gjetning+" er riktig gjettet!" + "\n"+
                            "Du gjettet "+antall+" ganger!");
    }

  public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
    tall = nyttTall();
    int antallForsøk = 0;
    while(true) {
        String innTall = showInputDialog("Jeg tenker på et tall mellom 0 og 200. \n "
                                        + "Prøv å gjette på tallet:");
        int tallInput = Integer.parseInt(innTall);

        if (tall > tallInput) {
            forLite(tallInput);
        }
        if (tall < tallInput) {
            forStort(tallInput);
        }
        antallForsøk++;
        if (tall == tallInput) {
            avsluttRunde(antallForsøk, tallInput);
            break;
        }
    }    
  }
}

public class Oblig2_2 {
    public static void main(String[] args) {
        /*Driverklasse som oppretter et Tallspill-objekt og kjører spillet gjentatte runder inntil
        brukeren velger å avslutte.*/
        Tallspill ts = new Tallspill();
        ts.kjørSpill();
    }
}