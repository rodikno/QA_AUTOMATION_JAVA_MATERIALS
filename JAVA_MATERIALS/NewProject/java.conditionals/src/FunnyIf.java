public class FunnyIf {
    public static void main(String[] args) {
        boolean isHungry = true;

        if (isHungry) {
            //Цей блок коду виконається тільки, якщо вираз в дужках дорівнює true
            System.out.println("Wow looks like you can eat an elephant, take some food pls");
        }
        // А цей вираз виконається незалежно від умови, бо він не знаходиться в полоні її фігурних скобочок
        System.out.println("If you're not hungry, maybe just drink some water.");
    }
}
