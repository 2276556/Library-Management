import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int choice = 0;
        while(choice !=3) {
            System.out.println("Enter 1 to verify your personal information\nEnter 2 to see available books\nEnter 3 to exit");
            choice = obj.nextInt();

            if (choice == 1) {
                Unit1 obj1 = new Unit1();

                System.out.println("Enter student's name");
                obj1.name = obj.nextLine(); obj1.name = obj.nextLine();

                System.out.println("Enter the student number");
                obj1.stu_number = obj.nextLine();

                System.out.println("Enter user id");
                obj1.uid = obj.nextLine();

                System.out.println("Enter the semester");
                obj1.sem = obj.nextInt();

                obj1.getdata (obj1.name, obj1.stu_number, obj1.uid, obj1.sem);
                obj1.setdata();
            }

            else if(choice ==2) {
                Unit2 obj2 = new Unit2();

                obj2.calculus();
                obj2.physics();
                obj2.chemistry();

            }
        }
    }
}
