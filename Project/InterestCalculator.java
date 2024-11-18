import java.util.Scanner;

public class InterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate Compound Interest
    public static double calculateCompoundInterest(double principal, double rate, double time, int frequency) {
        // Compound Interest Formula: A = P(1 + r/n)^(nt)
        // Where P is the principal, r is the rate, t is the time, and n is the number of times the interest is compounded per year
        return principal * Math.pow(1 + (rate / (100 * fr   equency)), frequency * time) - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Choose interest type
        System.out.println("Choose the type of interest: ");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double simpleInterest = calculateSimpleInterest(principal, rate, time);
            System.out.println("The Simple Interest is: " + simpleInterest);
        } else if (choice == 2) {
            System.out.print("Enter the number of times the interest is compounded per year: ");
            int frequency = scanner.nextInt();
            double compoundInterest = calculateCompoundInterest(principal, rate, time, frequency);
            System.out.println("The Compound Interest is: " + compoundInterest);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
