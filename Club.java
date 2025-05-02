package Experiment4;

class Club {
    static String clubName = "Tech Club";
    private String memberName;

    public Club(String memberName) {
        this.memberName = memberName;
    }

    public static void displayClubName() {
        System.out.println("Club Name: " + clubName);
    }

    public void displayMemberInfo() {
        System.out.println("Member: " + memberName + ", Club: " + clubName);
    }

    public static void main(String[] args) {
        Club.displayClubName();
        Club member1 = new Club("Alice");
        Club member2 = new Club("Bob");

        member1.displayMemberInfo();
        member2.displayMemberInfo();
    }
}
