public class Main {
    public static void main(String[] args) {

        Cookie myChocolateCookie = new Cookie();

        myChocolateCookie.butter = "Вершкове масло";
        myChocolateCookie.sugar = "Коричневий цукор";
        myChocolateCookie.flour = "Біла пшенична мука";


        Cookie anotherCookie = new Cookie();

        anotherCookie.butter = "Вершкове масло";
        anotherCookie.sugar = "Білий цукор";
        anotherCookie.flour = "Житня мука";

        myChocolateCookie.bake();
        anotherCookie.bake();

        System.out.println("Всього печенюшок приготовано: " + Cookie.amountOfCookiesPrepared);

        System.out.println(System.identityHashCode(myChocolateCookie));
        System.out.println(System.identityHashCode(anotherCookie));


    }
}