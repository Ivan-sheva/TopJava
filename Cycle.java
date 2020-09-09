public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int count1 = 6;
        while (count1 > -6) {
            count1=count1-2;
            System.out.println(count1);

        }

        int count2 = 10;
        do {
            count2++;
            if (count2 % 2 != 0) {
                System.out.println(count2);
            }
        } while (count2 < 20);
    }
}
