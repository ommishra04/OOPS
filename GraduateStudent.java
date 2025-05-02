package Experiment5_q3;

class GraduateStudent extends Person {
    protected String studentId;
    protected String course;
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, String studentId, String course, String researchTopic) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
        this.researchTopic = researchTopic;
    }

    public void submitThesis() {
        System.out.println(name + " is submitting thesis on " + researchTopic);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Course: " + course);
        System.out.println("Research Topic: " + researchTopic);
    }
}
