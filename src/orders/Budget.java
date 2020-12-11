package orders;

import javafx.scene.web.HTMLEditorSkin;

public class Budget implements Observateur{

    public double budg;
    public double mtBloquée;
    public Demande demande;

    public Budget(double budg) {
        this.budg = budg;
        this.mtBloquée=0;
    }

    public double getBudg() {
        return budg;
    }

    public void setBudg(double budg) {
        this.budg = budg;
    }

    public Demande getDemande() {
        return demande;
    }

    public void setDemande(Demande demande) {
        this.demande = demande;
    }

    public double getMtBloquée() {
        return mtBloquée;
    }

    public void setMtBloquée(double mtBloquée) {
        this.mtBloquée = mtBloquée;
    }

    @Override
    public void actualise() {
        if (this.demande.getState().equals(this.demande.APPROUVE))
            this.mtBloquée=this.demande.getMt();
        if (this.demande.getState().equals(this.demande.INPROGRESS)){
            this.budg = this.budg-this.mtBloquée;
            this.mtBloquée = 0;
        }

    }
}
