package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        //commentaire
        Scanner sc= new Scanner (System.in); 
        int salaireBase= 400;
        int prime= 250;
        int quota= 10;
        // github
        System.out.println("entrer votre nombre de ventes par semaine:");
        int nbreVentes= sc.nextInt();
        if ( nbreVentes >= quota) {
            
            salaireBase= salaireBase + prime;
            System.out.println("Félicitation!, votre salaire Finale est:"+ salaireBase);
            
        }else {
            int venteManquantes= quota- nbreVentes; 
           
          System.out.println("votre salaire est:"+ salaireBase+ " Il vous manque "+ venteManquantes + " pour bénificier du prime");
        }
    }
    
}
