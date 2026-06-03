import java.util.Scanner;

public class AttendanceManagement {

    static int[] rollNo = new int[50];
    static String[] name = new String[50];
    static String[] attendance = new String[50];
    static int count = 0;

    static void addStudent(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        count++;

        System.out.println("Student Added Successfully!");
    }

    static void markAttendance(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {

                System.out.print("Enter Attendance (Present/Absent): ");
                attendance[i] = sc.next();

                System.out.println("Attendance Marked!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    static void viewAttendance() {

        if (count == 0) {
            System.out.println("No Students Available!");
            return;
        }

        System.out.println("\nAttendance Records");
        System.out.println("-------------------");

        for (int i = 0; i < count; i++) {
            System.out.println(
                "Roll No: " + rollNo[i] +
                " | Name: " + name[i] +
                " | Attendance: " + attendance[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Attendance Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    markAttendance(sc);
                    break;

                case 3:
                    viewAttendance();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
