public class Main {
    public static void main(String[] args) {


        Season season = Season.AUTUMN;

        System.out.println(season.getTranslation());

        for (Season ssn : Season.values()) {
            System.out.println(ssn.toString() + ", " + ssn.getTranslation());
        }
    }
}