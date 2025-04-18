// File: Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Calculator Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.print("Enter your choice (1-7): ");
            int choice = sc.nextInt();

            double a, b;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Addition.add(a, b);
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Subtraction.subtract(a, b);
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Multiplication.multiply(a, b);
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    Division.divide(a, b);
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    Square.square(a);
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    Cube.cube(a);
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    a = sc.nextDouble();
                    SquareRoot.sqrt(a);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}