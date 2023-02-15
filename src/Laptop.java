public class Laptop extends Computer {
    private String keyboard;

    public Laptop(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
