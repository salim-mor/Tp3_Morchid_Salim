package orders;

public class ServiceComptable extends OrderHandler {



    @Override
    public void handleRequest(Demande demande, Budget budget) {
        super.nextHandler= new ServicePatrimoine();
        if (demande.getState().equals(demande.INIT)&& demande.getMt()<=budget.budg) {
            demande.setState(demande.APPROUVE);
            super.nextHandler.handleRequest(demande,budget);
        }




    }


}
