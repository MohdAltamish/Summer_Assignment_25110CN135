// Write a program to Create ticket booking system.
import java.util.*;

public class Ques111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSeats = 20;
        boolean[] seats = new boolean[totalSeats];
        String[] passengers = new String[totalSeats];
        int choice;

        System.out.println("=== Ticket Booking System ===");
        System.out.println("Total seats available: " + totalSeats);

        do {
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Available Seats");
            System.out.println("4. View Booked Seats");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter seat number (1-" + totalSeats + "): ");
                    int bookSeat = sc.nextInt();
                    sc.nextLine();
                    if (bookSeat >= 1 && bookSeat <= totalSeats) {
                        if (!seats[bookSeat - 1]) {
                            System.out.print("Enter passenger name: ");
                            passengers[bookSeat - 1] = sc.nextLine();
                            seats[bookSeat - 1] = true;
                            System.out.println("Seat " + bookSeat + " booked for " + passengers[bookSeat - 1] + ".");
                        } else {
                            System.out.println("Seat " + bookSeat + " is already booked.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter seat number to cancel (1-" + totalSeats + "): ");
                    int cancelSeat = sc.nextInt();
                    if (cancelSeat >= 1 && cancelSeat <= totalSeats) {
                        if (seats[cancelSeat - 1]) {
                            System.out.println("Ticket for " + passengers[cancelSeat - 1] + " cancelled.");
                            seats[cancelSeat - 1] = false;
                            passengers[cancelSeat - 1] = null;
                        } else {
                            System.out.println("Seat " + cancelSeat + " is not booked.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;
                case 3:
                    System.out.println("Available seats:");
                    boolean anyAvailable = false;
                    for (int i = 0; i < totalSeats; i++) {
                        if (!seats[i]) {
                            System.out.print((i + 1) + " ");
                            anyAvailable = true;
                        }
                    }
                    if (!anyAvailable) System.out.print("No seats available.");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Booked seats:");
                    boolean anyBooked = false;
                    for (int i = 0; i < totalSeats; i++) {
                        if (seats[i]) {
                            System.out.println("Seat " + (i + 1) + " - " + passengers[i]);
                            anyBooked = true;
                        }
                    }
                    if (!anyBooked) System.out.println("No seats booked.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
