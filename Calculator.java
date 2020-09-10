public class Calculator {
    public static void main(String[] args) {
        int a = 11;
        int b = 23;
        char plus = '+';
        char minus = '-';
        char multiplication = '*';
        char division = '/';
        char exponentiating = '^';
        char remainder = '%';

        if (plus == '+') {
            System.out.println(a + b);
        } else if (minus == '-') {
            System.out.println(a - b);
        } else if (multiplication == '*') {
            System.out.println(a * b);
        } else if (division == '/') {
            System.out.println(a / b);
        } else if (exponentiating == '^') {
            System.out.println("Число a в степени = " + (a * a) + " Число b в степени = " + (b * b));
        } else if (remainder == '%') {
            System.out.println(a % b);
        }
    }
}
