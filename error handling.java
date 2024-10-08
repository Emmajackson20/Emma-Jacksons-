public class DivisionByZeroExample {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result = 0;

        try {
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
