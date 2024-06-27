public class FunnyIfElse {
    public static void main(String[] args) {
        boolean isSleepy = false;

        if (isSleepy) {
            // Виконається ТІЛЬКИ тоді, коли вираз в дужках дорівнює true
            System.out.println("You're sleepy. Time for a nap!");
        } else {
            // Виконається ТІЛЬКИ тоді, коли вираз в дужках біля if дорівнює false
            System.out.println("Not sleepy? Let's watch some cat videos!");
        }

        //Виконається в будь-якому випадку бо не належить області видимості умови
        System.out.println("THIS LINE DOESN'T CARE ABOUT CONDITIONALS");
    }
}
