public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        while (i > -6) {
            i--;
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        int t = 10;
        do {
            t++;
            if (t % 2 != 0) {
                System.out.println(t);
            }
        } while (t < 20);
    }
}
