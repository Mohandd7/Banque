package metier;

public class Compte {


    private String numero;
    private double solde;


    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String n) {
        this.numero = n;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double s) {

        if (s >= 0) {
            this.solde = s;
        } else {
            this.solde = 0.0;
        }
    }


    public Compte(String n, double s) {
        setNumero(n);
        setSolde(s);
    }

    public Compte() {
    }


    public void verser(double montant) {
        double solde;
        solde = getSolde() + montant;
        setSolde(solde);
    }

    public void retirer(double montant) {
        setSolde(getSolde() - montant);
    }

    public void virer(double montant, Compte unCpt) {
        retirer(montant);
        unCpt.verser(montant);
    }
}