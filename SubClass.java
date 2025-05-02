package Experiment5_q1;

class SubClass extends SuperClass {
    public void display() {
        // System.out.println(privateData); // This will cause a compilation error
        System.out.println("Cannot access private member directly.");
    }
}
