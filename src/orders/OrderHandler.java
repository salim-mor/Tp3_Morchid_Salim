package orders;

public abstract class  OrderHandler {

    public OrderHandler nextHandler;
    public abstract void handleRequest(Demande demande, Budget budget);
}
