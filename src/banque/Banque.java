package banque;

import metier.*;
import java.util.Scanner;

public class Banque {

    public static void main(String[] args) {
        double depot, retrait, virement;


        Compte unCompte = new Compte("00112345", 1000.0);
        System.out.println("compte : " + unCompte.getNumero() + " solde à la création du compte = " + unCompte.getSolde());

        depot = 500.0;
        unCompte.verser(depot);
        System.out.println("compte : " + unCompte.getNumero() + " solde après dépôt de " + depot + " = " + unCompte.getSolde());

        retrait = 250.0;
        unCompte.retirer(retrait);
        System.out.println("compte : " + unCompte.getNumero() + " solde après retrait de " + retrait + " = " + unCompte.getSolde());


        Compte unAutreCompte = new Compte("7827456", 2500.0);
        System.out.println("compte : " + unAutreCompte.getNumero() + " solde à la création du compte = " + unAutreCompte.getSolde());

        retrait = 200.0;
        unAutreCompte.retirer(retrait);
        System.out.println("compte : " + unAutreCompte.getNumero() + " solde après retrait de " + retrait + " = " + unAutreCompte.getSolde());

        depot = 150.0;
        unAutreCompte.verser(depot);
        System.out.println("compte : " + unAutreCompte.getNumero() + " solde après dépôt de " + depot + " = " + unAutreCompte.getSolde());


        virement = 350.0;
        unCompte.virer(virement, unAutreCompte);
        System.out.println("compte : " + unAutreCompte.getNumero() + " solde après virement de " + virement + " = " + unAutreCompte.getSolde());
        System.out.println("compte : " + unCompte.getNumero() + " solde après virement de " + virement + " = " + unCompte.getSolde());


        Compte monCompte = new Compte();
        Scanner sc = new Scanner(System.in);


        System.out.println("Saisir le n° du compte : ");
        String numeroCompte = sc.nextLine();

        monCompte.setNumero(numeroCompte);


        System.out.println("Saisir le montant du solde : ");
        double montantSolde = sc.nextDouble();

        monCompte.setSolde(montantSolde);


        System.out.println("Compte : " + monCompte.getNumero() + " solde = " + monCompte.getSolde());
    }
}