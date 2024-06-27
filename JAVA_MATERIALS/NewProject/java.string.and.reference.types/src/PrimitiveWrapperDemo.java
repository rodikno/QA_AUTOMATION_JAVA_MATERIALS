public class PrimitiveWrapperDemo {
    public static void main(String[] args) {
        // Byte
        Byte byteWrapper = 10;
        System.out.println("Byte value: " + byteWrapper);
        System.out.println("Byte to int: " + byteWrapper.intValue());

        // Short
        Short shortWrapper = 100;
        System.out.println("Short value: " + shortWrapper);
        System.out.println("Short to double: " + shortWrapper.doubleValue());

        // Integer
        Integer intWrapper = 1000;
        System.out.println("Integer value: " + intWrapper);
        System.out.println("Integer to float: " + intWrapper.floatValue());

        // Long
        Long longWrapper = 10000L;
        System.out.println("Long value: " + longWrapper);
        System.out.println("Long to short: " + longWrapper.shortValue());

        // Float
        Float floatWrapper = 10.5f;
        System.out.println("Float value: " + floatWrapper);
        System.out.println("Float to int: " + floatWrapper.intValue());

        // Double
        Double doubleWrapper = 100.123;
        System.out.println("Double value: " + doubleWrapper);
        System.out.println("Double to long: " + doubleWrapper.longValue());

        // Character
        Character charWrapper = 'A';
        System.out.println("Character value: " + charWrapper);
        System.out.println("Character to lower case: " + Character.toLowerCase(charWrapper));

        // Boolean
        Boolean booleanWrapper = true;
        System.out.println("Boolean value: " + booleanWrapper);
        System.out.println("Boolean negation: " + !booleanWrapper);
    }
}
