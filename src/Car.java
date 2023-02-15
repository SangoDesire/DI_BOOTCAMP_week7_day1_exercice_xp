// Derived Class
class Car extends Vehicle {

    private String carName;

    // Default Constructor
    public Car() {

    }

    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function
        this.carName = name;
    }

    // This function calls the Base class functions and appends the result with the input
    public String getDetails(String carName) {

        return this.getModel() + ", " + carName + ", " + this.getSpeed();
    }

}