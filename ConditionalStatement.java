public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        char sex = 'M';
        double growth = 1.60;
        char firstLetterOfName = 'I';
        if (age < 20) {
            System.out.println("Ваш возраст меньше 20");
        }
        if (sex == 'M') {
            System.out.println("Вы мужского пола");
        }
        if (sex != 'M') {
            System.out.println("Вы женского рода");
        }
        if (growth < 1.80) {
            System.out.println("Ваш рост меньше 1.80");
        } else {
            System.out.println("Ваш рост больше 1.80");
        }
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква вашего имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква вашего имени I");
        } else {
            System.out.println("Ваше имя не начинается с букв M или I");
        }
    }
}
