public class StringInitializationDemo {
    // Instance variable
    String instanceString;

    // Static variable
    static String staticString;

    public void demonstrateUninitialized() {
        // Local variable
        String localString;

        System.out.println("Instance string: " + instanceString);
        System.out.println("Static string: " + staticString);

        // This would cause a compile-time error if uncommented
//        System.out.println("Local string: " + localString);
    }

    public static void main(String[] args) {
        StringInitializationDemo demo = new StringInitializationDemo();
        demo.demonstrateUninitialized();
    }
}