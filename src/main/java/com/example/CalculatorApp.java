package main.java.com.example;

/**
 * Simple calculator application
 */
public class CalculatorApp {

    public static void main(String[] args) {
        System.out.println("Calculator Application 1.0.0");
        System.out.println("---------------------------");

        com.example.Calculator calculator = new com.example.Calculator();

        // Example calculations
        double a = 10;
        double b = 5;

        System.out.println(a + " + " + b + " = " + calculator.add(a, b));
        System.out.println(a + " - " + b + " = " + calculator.subtract(a, b));
        System.out.println(a + " * " + b + " = " + calculator.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculator.divide(a, b));

        System.out.println("---------------------------");
        System.out.println("Thank you for using the Calculator App!");
    }
}
