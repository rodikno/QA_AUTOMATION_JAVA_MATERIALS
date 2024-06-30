/**
 * Created by Rodion Baronov on 23-Jun-24.
 */
public class ArithmeticOperatorsAdvanced {

    public static void main(String[] args) {
        // Assignment operators
        int a = 10;     // assigns 10 to a
        double b = 20.5; // assigns 20.5 to b

        // Arithmetic operators
        int sum = a + 5;          // addition
        int difference = a - 3;   // subtraction
        int product = a * 2;      // multiplication
        double quotient = b / 2;  // division
        int remainder = a % 3;    // modulus

        // Short assignment operators
        a += 2;  // equivalent to a = a + 2
        b -= 1.5; // equivalent to b = b - 1.5
        a *= 3;  // equivalent to a = a * 3
        b /= 2;  // equivalent to b = b / 2
        a %= 4;  // equivalent to a = a % 4

        // Unary operators
        int positive = +a;  // positive
        int negative = -a;  // negative
        int preIncrement = ++a; // pre-increment
        int postIncrement = a++; // post-increment
        int preDecrement = --a; // pre-decrement
        int postDecrement = a--; // post-decrement

        // Comparison operators
        boolean isEqual = (a == b);   // checks if a is equal to b
        boolean isNotEqual = (a != b); // checks if a is not equal to b
        boolean isGreater = (a > b);  // checks if a is greater than b
        boolean isLesser = (a < b);   // checks if a is less than b
        boolean isGreaterOrEqual = (a >= b); // checks if a is greater than or equal to b
        boolean isLesserOrEqual = (a <= b);  // checks if a is less than or equal to b

        // Logical operators
        boolean logicalAnd = (a > 5 && b < 10);  // logical AND
        boolean logicalOr = (a > 5 || b < 10);   // logical OR
        boolean logicalNot = !(a > 5);           // logical NOT

        // Bitwise operators
        int bitwiseAnd = a & 2; // bitwise AND
        int bitwiseOr = a | 2;  // bitwise OR
        int bitwiseXor = a ^ 2; // bitwise XOR
        int bitwiseNot = ~a;    // bitwise NOT
        int leftShift = a << 1; // left shift
        int rightShift = a >> 1; // right shift
        int unsignedRightShift = a >>> 1; // unsigned right shift

        // Ternary operator
        int result = (a > b) ? a : (int) b; // returns a if a is greater than b, otherwise returns b

        // Output the results
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);
        System.out.println("isEqual = " + isEqual);
        System.out.println("isNotEqual = " + isNotEqual);
        System.out.println("isGreater = " + isGreater);
        System.out.println("isLesser = " + isLesser);
        System.out.println("isGreaterOrEqual = " + isGreaterOrEqual);
        System.out.println("isLesserOrEqual = " + isLesserOrEqual);
        System.out.println("logicalAnd = " + logicalAnd);
        System.out.println("logicalOr = " + logicalOr);
        System.out.println("logicalNot = " + logicalNot);
        System.out.println("bitwiseAnd = " + bitwiseAnd);
        System.out.println("bitwiseOr = " + bitwiseOr);
        System.out.println("bitwiseXor = " + bitwiseXor);
        System.out.println("bitwiseNot = " + bitwiseNot);
        System.out.println("leftShift = " + leftShift);
        System.out.println("rightShift = " + rightShift);
        System.out.println("unsignedRightShift = " + unsignedRightShift);
        System.out.println("result = " + result);
    }
}
