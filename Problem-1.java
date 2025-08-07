Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string


Program:

import java.util.*;
import java.util.Scanner;

class Calculator {
    
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0)
                    return a / b;
                else {
                    System.out.println("Error: Division by zero!");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation!");
                return Double.NaN;
        }
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}
