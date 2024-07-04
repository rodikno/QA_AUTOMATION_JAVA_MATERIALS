
public class Cookie {

    static final String COOKIE_CALLOUT = "Grandmas' amazing cookies";
    static int amountOfCookiesPrepared = 0;
    String flour;
    String sugar;
    String butter;
    boolean isBaked = false;

    public void bake() {
        System.out.println("Додаємо " + this.flour);
        System.out.println("Додаємо " + this.sugar);
        System.out.println("Додаємо " + this.butter);
        System.out.println("Кладемо в духовку");
        System.out.println("Печиво випікається...");
        System.out.println("Печиво готове!");
        this.isBaked = true;
        amountOfCookiesPrepared++;
    }
}
