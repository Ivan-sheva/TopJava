public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        char arithmeticOperation = '^';

        if (arithmeticOperation == '+') {
            System.out.println(a + b);
        } else if (arithmeticOperation == '-') {
            System.out.println(a - b);
        } else if (arithmeticOperation == '*') {
            System.out.println(a * b);
        } else if (arithmeticOperation == '/') {
            System.out.println(a / b);
        } else if (arithmeticOperation == '^') {
            int c = 1;
            for (int i = 0; i < b; i++) {
                c = c * a;
            }
            System.out.println(c);
        } else if (arithmeticOperation == '%') {
            System.out.println(a % b);
        }
    }
}
