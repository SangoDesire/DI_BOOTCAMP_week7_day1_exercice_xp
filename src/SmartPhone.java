public class SmartPhone extends Computer {
private String gsmNetwork ;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String gsmNetwork) {
        this.gsmNetwork = gsmNetwork;
    }

    public String getGsmNetwork() {
        return gsmNetwork;
    }

    public void setGsmNetwork(String gsmNetwork) {
        this.gsmNetwork = gsmNetwork;
    }

    public void makeCall(){
        System.out.println("I dial you number for calling");
    }
}
