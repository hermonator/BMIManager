import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by jc259420 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println("BMI Manager");





    running: while(true) {


        System.out.println("Please select from the " +
                "following menu options:\n" +
                "\t1. Add new patient\n" +
                "\t2. View patient\n" +
                "\t3. Exit\n");
        System.out.print("Enter choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1: {
                addPatient(patient, scanner);

                break;
            }
            case 2: {
                viewPatient(patient);

                break;
            }
            case 3: {
                System.out.println("Good bye!");
                break running;
            }
        }
    }
    }
    private static void viewPatient(Patient patient) {
        System.out.println(String.format("Name: %s Age: %d BMI %.2f",
                patient.getName(), patient.getAge(), patient.getBMI()));

    }

    private static void addPatient(Patient patient, Scanner scanner) {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        patient.setName(name);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        patient.setAge(age);

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();
        patient.setDetails(height, weight);
    }
}

