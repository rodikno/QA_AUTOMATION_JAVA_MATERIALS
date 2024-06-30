import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {


        //Example of the simplest authentication flow using while loop
        Scanner scanner = new Scanner(System.in);
        String currentPassword = "";

        String correctPassword = "MyPassword123";
        boolean notAuthorized = true;

        while (notAuthorized) {
            System.out.println("Please enter your password:");
            currentPassword = scanner.nextLine();
            if (currentPassword.equals(correctPassword)) {
                System.out.println("Welcome home, dear authorized user!");
                notAuthorized = false;
            } else {
                System.out.println("Password is incorrect. Please try again.");
            }
        }

    }
}
