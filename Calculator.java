public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        char arithmeticOperation = '/';

        if (arithmeticOperation == '+') {
            System.out.println(a + b);
        } else if (arithmeticOperation == '-') {
            System.out.println(a - b);
        } else if (arithmeticOperation == '*') {
            System.out.println(a * b);
        } else if (arithmeticOperation == '/') {
            System.out.println(a / b);
        } else if (arithmeticOperation == '^') {
            System.out.println("Число a в степени b = " + (Math.pow(a, b)));
        } else if (arithmeticOperation == '%') {
            System.out.println(a % b);
        }
    }
}
