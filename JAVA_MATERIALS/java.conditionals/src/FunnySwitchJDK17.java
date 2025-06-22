public class FunnySwitchJDK17 {

    public static void main(String[] args) {

//        ....
        /*....
        *
        * ..
        * .*/

        WeatherTypes currentWeather = WeatherTypes.SUNNY;

        String motivationMessage = switch (currentWeather) {
            case SNOWY -> "It's snowing. Take a shower.";
            case RAINY -> "It's raining. Take a umbrella.";
            case SUNNY, WINDY -> "Yay! It's sunny. Or Windy";
        };

        System.out.println(motivationMessage);
    }
}
