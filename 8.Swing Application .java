import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== STUDENT REGISTRATION FORM ===");
        System.out.println("---------------------------------");


        System.out.print("Enter USN: ");
        String usn = scanner.nextLine().trim();


        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();


        if (usn.isEmpty() || name.isEmpty()) {
            System.out.println("\n[ERROR]: Please fill in both USN and Name!");
            return;
        }


        System.out.print("Enter Branch (e.g., CSE, ISE, ECE): ");
        String branch = scanner.nextLine().trim();


        System.out.print("Enter Gender (Male/Female/Other): ");
        String gender = scanner.nextLine().trim();


        if (gender.isEmpty()) {
            System.out.println("\n[ERROR]: Please select/enter Gender!");
            return;
        }


        System.out.println("\n=================================");
        System.out.println("   REGISTRATION DETAILS SAVED    ");
        System.out.println("=================================");
        System.out.println("USN     : " + usn);
        System.out.println("Name    : " + name);
        System.out.println("Branch  : " + branch);
        System.out.println("Gender  : " + gender);
        System.out.println("=================================");

        scanner.close();
    }
}

