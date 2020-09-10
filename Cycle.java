public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int counter = 6;
        while (counter > -6) {
            counter = counter - 2;
            System.out.println(counter);
        }

        counter = 10;
        int sortNumbersSum = 0;
        do {
            counter++;
            if (counter % 2 != 0) {
                sortNumbersSum += counter;
            }
        } while (counter < 20);
        System.out.println(sortNumbersSum);
    }
}
