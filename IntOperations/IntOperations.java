package IntOperations;

public class IntOperations {
    public static int addTwoIntegers(int a, int b) {
       return a + b;
    }
    public static int subtractTwoIntegers(int a, int b) {
        return a - b ;
    }
    public static int multiplyTwoIntegers(int a, int b) {
       return  a * b;
    }
    public static int divideTwoIntegers(int a, int b) {
        if (a == 0 || b == 0 ){
            return 0;
        }
        return a / b ;
    }
}