package example;

public class Calculator {
    public int add(int a, int b) {
        // TODO: Implement this method
        int sum;
        sum = a + b;
        return sum;
    }

    public int minus(int a, int b) {
        // TODO: Implement this method
        int difference;
        difference = a - b;
        return difference;
    }

    public int multiply(int a, int b) {
        // TODO: Implement this method
        int product;
        product = a * b;
        return product;
    }

    public double divide(int a, int b) {
        // TODO: Implement this method
        int quotient;
        if (a == 0){
            System.out.println("Division by zero not allowed");
            return 0;
        }
        quotient = a/b;
        return quotient;
    }
}
