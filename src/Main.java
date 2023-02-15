public class Main {
    public static void main(String[] args) {
        //Exercise1
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));

        MyPoint p2 = new MyPoint(5, 6);
        System.out.println(p1.distance(p2));

        //Exercise2
        Person person = new Person("John", "Wick", "john@wick.com", 55);
        System.out.println(person);

        //Exercice 3
        Car car = new Car();
        car.setModel("Tesla");
        car.setSpeed(100);
        System.out.println(car.getDetails("Roadster"));

        //Exercice 4
        Laptop laptop = new Laptop("Azerty");
        laptop.setOs("Windows");
        laptop.setScreeSize(15.6);
        laptop.setWeight(1.5);
        laptop.start();
        System.out.println(laptop.getInfos());

        SmartPhone smartPhone = new SmartPhone("2G, 3G, 4G, LTE");
        smartPhone.setOs("Android");
        smartPhone.setWeight(0.98);
        smartPhone.setScreeSize(17.5);
        smartPhone.makeCall(); //Methode de la classe fille
        System.out.println(smartPhone.getInfos()); //Methode de la classe parente
    }
}