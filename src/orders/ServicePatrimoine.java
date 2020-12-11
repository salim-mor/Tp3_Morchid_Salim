package orders;

public class ServicePatrimoine extends OrderHandler {


    @Override
    public void handleRequest(Demande demande, Budget budget) {
        demande.setState(demande.INPROGRESS);
        demande.setState(demande.DONE);

    }


}
