public class Main {
    public static void main(String[] args) {
        // Assignment operators (=)
        int a = 10;
        int b = 5;

// Arithmetic operators (+, -, *, /, %)
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = a / (double) b; // use double cast to prevent truncating in integer division
        int modulus = a % b;

// Unary operators (+, -, ++, --) - PREFIX and POSTFIX
        int positiveA = +a;
        int negativeA = -a;
        int incrementPrefix = ++a;
        a = 10; // resetting a's value
        int incrementPostfix = a++;
        a = 10; // resetting a's value
        int decrementPrefix = --a;
        a = 10; // resetting a's value
        int decrementPostfix = a--;

// Short assignment operators (+=, -=, *=, /=, %=)
        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;

// Comparison operators (==, !=, >, <, >=, <=)
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLesser = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLesserOrEqual = (a <= b);

// Logical operators (&&, ||, !)
        boolean logicalAnd = (a > 5 && b < 10);
        boolean logicalOr = (a > 5 || b < 10);
        boolean logicalNot = !(a > 5);

// Bitwise operators (&, |, ^, ~, <<, >>, >>>)
        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseComplement = ~a;
        int leftShift = a << 2;
        int rightShift = a >> 2;
        int zeroFillRightShift = a >>> 2;

// Ternary operator (? :)
        int result = (a > b) ? a : b;

// Output the results
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
