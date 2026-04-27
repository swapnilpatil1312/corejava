package assignment7;

import java.util.Scanner;

// Custom Exception
class NegativeDiameterException extends Exception {
    public NegativeDiameterException() {
        super("This is a negative value!");
    }
}

public class Q2 {
    private double myx;
    private double myy;
    private double mydiameter; // Removed 'static'

    public Q2(double myx, double myy, double mydiameter) throws NegativeDiameterException {
        if (mydiameter < 0) {
            throw new NegativeDiameterException();
        }
        this.myx = myx;
        this.myy = myy;
        this.mydiameter = mydiameter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter x coordinate: ");
            double x = sc.nextDouble();
            System.out.print("Enter y coordinate: ");
            double y = sc.nextDouble();
            System.out.print("Enter diameter: ");
            double d = sc.nextDouble();

            Q2 circle = new Q2(x, y, d);
            System.out.println("Circle created successfully with diameter: " + d);

        } catch (NegativeDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}
