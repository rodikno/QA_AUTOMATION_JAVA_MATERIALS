public class FunnyIfElseIfElse {

    public static void main(String[] args) {

        int weather = 888; // 0 for sunny, 1 for rainy, 2 for snowy

        if (weather == 0) {
            //Виконається, якщо вираз у першому if дорівнює true
            System.out.println("It's sunny! Let's go to the beach!");
        } else if (weather == 1) {
            //Виконаєтсья, якщо вираз у першому if дорівнює false, але у нашому if - true
            System.out.println("It's rainy. Let's stay in and play board games.");
        } else if (weather == 2) {
            //Виконається, якщо вираз дорівнює false для усих верхніх блоків if, але true для свого блоку
            System.out.println("It's snowy! Time to build a snowman!");
        } else {
            //Виконається, якщо УСІ if або else-if вище не відпрацювали (тобто вираз не був true для жодного з них)
            System.out.println("Unknown weather! Let's just read a book.");
        }
    }
}
