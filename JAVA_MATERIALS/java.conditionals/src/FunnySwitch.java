public class FunnySwitch {
    public static void main(String[] args) {


        int dayOfWeek = 1; // 1 for Monday, 2 for Tuesday, ..., 7 for Sunday

        /* 3 MAIN RULES OF USING SWITCH-CASE
        * 1) Use only when there's no alternative
        * 2) DON't you dare to forget BREAK in the end of CASE statement (if old-styled switch is used)
        * 3) Always use DEFAULT block in the end to tell your program what to do in case none of the cases was effective
        * */

        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday. Let's start the week with a cup of coffee.");
                break;
            case 2:
                System.out.println("It's Tuesday. Taco Tuesday, anyone?");
                break;
            case 3:
                System.out.println("It's Wednesday. We're halfway there!");
                break;
            case 4:
                System.out.println("It's Thursday. Just one more day to Friday!");
                break;
            case 5:
                System.out.println("It's Friday! Time to celebrate the weekend!");
                break;
            case 6:
                System.out.println("It's Saturday. Perfect day for an adventure!");
                break;
            case 7:
                System.out.println("It's Sunday. Time to relax and recharge.");
                break;
            default:
                System.out.println("Invalid day. Time is an illusion.");
                break;
        }


        System.out.println("THIS IS PRINTED UNCONDITIONALLY");
    }
}
