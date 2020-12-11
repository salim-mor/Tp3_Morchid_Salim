import orders.*;

public class test {
    public static void main(String[] args) {
        Demande demande = new Demande(10);
        Budget budget = new Budget(50);

        demande.setObservateur(budget);
        budget.setDemande(demande);

        OrderHandler orderHandler = new ServiceComptable();

        orderHandler.handleRequest(demande ,budget);

        System.out.println("l etat finale de la demande :"+demande.getState());
        System.out.println("budget final :"+budget.getBudg());
        System.out.println("le montant bloqué final :"+budget.getMtBloquée());
    }
}
