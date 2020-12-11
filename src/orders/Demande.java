package orders;


public class Demande extends Obsrvebale{
    public static String INIT= "INIT";
    public static String APPROUVE="APPROUVE";
    public static String INPROGRESS = "INPROGRESS";
    public static String DONE = "DONE";

    private long mt;
    private String state;

    public Demande(long mt) {
        this.mt = mt ;
        this.state = INIT ;
    }

    public long getMt(){
        return mt;
    }

    public void setMt(long mt) {
        this.mt = mt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        notifie();
        this.state = state;
    }
}
