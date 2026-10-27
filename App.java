import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        menu();
    }

    public static double add(double augend, double addend) { return augend + addend; }
    public static double subtract(double minuend, double subtrahend) { return minuend - subtrahend; }
    public static double multiply(double multiplier, double multiplicand) { return multiplier * multiplicand; }
    public static double divide(double dividend, double divisor) { return dividend / divisor; }

    public static double sin(double degrees) { return Math.sin(Math.toRadians(degrees)); }
    public static double power(double base, double exponent) { return Math.pow(base, exponent); }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int prev = 0, curr = 1;
        for(int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        
        while (choice != 0) {
            System.out.println("\nCALCULATOR - please select:\n0: end program\n1: add\n2: substract\n3: multiply\n4: divide\n5: sin(x)\n6: x^y\n7: gcd\n8: fibonacci(n)");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    System.out.println("Enter augend and addend");
                    System.out.println("Result: " + add(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 2:
                    System.out.println("Enter minuend and subtrahend:");
                    System.out.println("Result: " + subtract(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 3:
                    System.out.println("Enter multiplier and multiplicand:");
                    System.out.println("Result: " + multiply(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 4:
                    System.out.println("Enter dividend and divisor:");
                    System.out.println("Result: " + divide(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 5:
                    System.out.println("Enter angle in degrees (x):");
                    System.out.println("Result :" + sin(scanner.nextDouble()));
                    break;
                case 6:
                    System.out.println("Enter base (x) and exponent (y):");
                    System.out.println("Result: " + power(scanner.nextDouble(), scanner.nextDouble()));
                    break;
                case 7:
                    System.out.println("Enter two integers for gcd");
                    System.out.println("Result: " + gcd(scanner.nextInt(), scanner.nextInt()));
                    break;
                case 8:
                    System.out.println("Enter n for fibonacci");
                    System.out.println("Result :" + fibonacci(scanner.nextInt()));
                    break;
            }
        }
        scanner.close();
    }
}