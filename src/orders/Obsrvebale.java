package orders;

public class Obsrvebale {
    protected Observateur observateur;
   public void setObservateur(Observateur observateur){
       this.observateur=observateur;
   }
    public void notifie() {
            observateur.actualise();
    }
}
