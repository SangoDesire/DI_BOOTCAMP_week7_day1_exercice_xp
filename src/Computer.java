public class Computer {
    protected double screeSize;
    protected double weight;
    protected String os;

    public Computer() {
    }

    public Computer(double screeSize, double weight, String os) {
        this.screeSize = screeSize;
        this.weight = weight;
        this.os = os;
    }

    public String getInfos() {
        return "screen Size is : " + screeSize + ",and the weight of " + weight + ", with OS: " + os;
    }

    public void start(){
        System.out.println("i load...");
    }

    public double getScreeSize() {
        return screeSize;
    }

    public void setScreeSize(double screeSize) {
        this.screeSize = screeSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
