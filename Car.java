package Experiment4;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayCarInfo() {
        System.out.println("Car Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Tesla", "Model 3", 2025);
        myCar.displayCarInfo();
    }
}

