package Experiment5_q1;

public class PrivateMemberDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();

        System.out.println("Accessing private data via method: " + obj.getPrivateData());
    }
}

