/*
Oppgave 1
Lag et program som beregner og skriver ut summen av alle tall mellom 
to grenser som brukeren skriver inn. Programmet skal starte med å lese 
inn nedre og øvre grense for summen. 

Dersom innlest øvre grense er mindre 
enn eller lik nedre grense, skal programmet skrive ut en melding til 
brukeren om dette og foreta ny innlesing. 

Når godkjente grenser er lest inn, skal programmet beregne nevnte sum 
og summen skal så skrive den ut som en sum. 

Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut 
følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35". 

Test ut programmet med nedre grense lik 1 og øvre grense lik 100. 
Legg inn et linjeskift for hvert 10. tall i summen.∫
 */

package oblig2;

import static javax.swing.JOptionPane.*;

public class Oblig2 {
    public static void main(String[] args) {
        int sum = 0;
        String innTall = showInputDialog("Skriv inn et tall");
        String utTall = showInputDialog("Skriv inn et tall med høyere verdi enn forrige");
        int tall1 = Integer.parseInt(innTall);
        int tall2 = Integer.parseInt(utTall);
        
        if (tall2<tall1) {
            showMessageDialog(null,"Det andre tallet du skrev er mindre enn eller lik det første tallet du skrev.");
            main(args); //Rekursiv loop
            return;
        }
        while (tall1<=tall2) {
            sum += tall1; //sum = sum+tall1;
            System.out.print(tall1);    
            if(tall1 == tall2)
            {
                System.out.print(" = ");
            }
            else
            {
                System.out.print(" + ");
            }
            
            if (tall1%10 ==0)
            {
                System.out.println();
            }
            
            tall1++; //tall1 = tall1 + 1;
        }
        //if (tall1%11 == 0)
        System.out.println(sum);
    }
        //System.out.println(" = " + sum);
}


