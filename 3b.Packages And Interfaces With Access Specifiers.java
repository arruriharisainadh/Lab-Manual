class PiCalculator {

    // Private variable
    private double PI = Math.PI;

    // Public method
    public void displayPi() {
        System.out.println("Private Data - Accessed only within class:");
        System.out.println("Approximated value of Pi: " + PI);
    }

    // Protected method
    protected void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("\nProtected Method - Calculating Area:");
        System.out.println("Area of Circle using Precision Info:");
        System.out.println("Area = " + area);
        System.out.println("Series used: 1 + 1/1! + 1/2! + 1/3! + ...");
    }
}

public class Main {
    public static void main(String[] args) {

        PiCalculator obj = new PiCalculator();

        System.out.println("----- Calculation using Access Specifiers -----\n");

        obj.displayPi();
        obj.calculateArea(5);
    }
}
