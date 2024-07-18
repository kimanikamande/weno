public class Calculator {
    private int num1;
    private int num2;

    // Constructor
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Non-static method
    public int add() {
        return num1 + num2;
    }

    // Static method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method
    public static void printMessage() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        printMessage();

        Calculator calc = new Calculator(5, 3);
        int result = calc.add();
        System.out.println("Result of addition: " + result);

        int product = multiply(4, 5);
        System.out.println("Result of multiplication: " + product);
    }
}