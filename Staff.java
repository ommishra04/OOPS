package Experiment5_q3;

class Staff extends Person {
    protected String staffId;
    protected String department;

    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Staff ID: " + staffId + ", Department: " + department);
    }
}
