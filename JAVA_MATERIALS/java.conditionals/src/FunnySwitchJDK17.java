public class FunnySwitchJDK17 {

    public static void main(String[] args) {

        String dayType = "MONDAY";

        String motivationMessage = switch (dayType) {
            case "MONDAY" -> "It's Monday... Grab extra coffee.";
            case "FRIDAY" -> "It's Friday! Almost time to party!";
            case "SATURDAY", "SUNDAY" -> "Yay! It's the weekend. Take a nap.";
            default -> "Just another midweek grind day.";
        };

        System.out.println(motivationMessage);
    }
}
