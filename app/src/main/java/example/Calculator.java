package example;

public class Calculator {
    public int add(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }

    public int minus(int a, int b) {
        int difference;
        difference = a - b;
        return difference;
    }

    public int multiply(int a, int b) {
        int product;
        product = a * b;
        return product;
    }

    public double divide(int a, int b) {
        int quotient;

        if (a/b == 0) {
            System.out.println("error: divide by zero error");
            return 0;
        } else {
            quotient = a/b;
            return quotient;
        }
    }
}
