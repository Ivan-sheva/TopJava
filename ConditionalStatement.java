public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age < 20) {
            System.out.println("Ваш возраст меньше 20");
        }

        char sex = 'M';
        if (sex == 'M') {
            System.out.println("Вы мужского пола");
        }
        if (sex != 'M') {
            System.out.println("Вы женского рода");
        }

        double growth = 1.60;
        if (growth < 1.80) {
            System.out.println("Ваш рост меньше 1.80");
        } else {
            System.out.println("Ваш рост больше 1.80");
        }

        char firstLetterOfName = 'I';
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква вашего имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква вашего имени I");
        } else {
            System.out.println("Ваше имя не начинается с букв M или I");
        }
    }
}
