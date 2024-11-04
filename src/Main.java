import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    DB Connection
    private static final String DB_URL = "jdbc:mysql://localhost:3306/auroraskincare";
    private static final String USER = "jayani";
    private static final String PASS = "1234";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        // Do - While
        do{
            System.out.println("\n________________________");
            System.out.println("Aurora Skin Care Clinic");
            System.out.println("------------------------");
            System.out.println("1. Make Appointment");
            System.out.println("2. Update Appointment");
            System.out.println("3. View Appointments");
            System.out.println("4. Search Appointments");
            System.out.println("5. Placing appointments");
            System.out.println("6. Invoicing");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Making an appointment...");
                    break;
                case 2:
                    System.out.println("Updating an appointment...");
                    break;
                case 3:
                    System.out.println("Viewing an Appointment...");
                    break;
                case 4:
                    System.out.println("Searching Appointments...");
                    break;
                case 5:
                    System.out.println("Placing appointments...");
                    break;
                case 6:
                    System.out.println("Invoicing...");
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (choice !=7);
        s.close();
    }
}