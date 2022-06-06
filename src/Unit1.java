public class Unit1 {

    String name, stu_number, uid;
    int sem;

    public void getdata (String name, String stu_number, String uid, int sem) {
        this.name = name;
        this.stu_number = stu_number;
        this.uid = uid;
        this.sem = sem;
    }

    public void setdata() {
        System.out.println("student's name: " + name);
        System.out.println("student number: " + stu_number);
        System.out.println("user id: " + uid);
        System.out.println("semester: " + sem);
    }
}
