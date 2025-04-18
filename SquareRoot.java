public class SquareRoot {
    public static void sqrt(double a) {
        try {
            if (a < 0)
                throw new ArithmeticException("Cannot take square root of negative number");
            System.out.println("Result: " + Math.sqrt(a));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}