package week1;

public class Main {
    public static void main(String[] args) {
        // 논리형
        boolean testBoolean = true;
        // testBoolean = false;
        // 문자형
        char c = 'a';
        String testString = "asd1qweqwrt";
        // 정수형
        byte b = 1;
        short testshort = 2;
        int testInteger = 3;
        long testlong = 4;
        // 실수형
        float testfloat = 5.0f;
        double testdouble = 6.0;
        final int PI = 1;
        // PI = 12;
        // Immutable -> 바뀌지 않는다 value가
        String a = "sss";
        a += "11111";
        String newString = "sss11111";
        int testAutoTypeCasting = 5;
        long testLoginAutoTypeCasting = testAutoTypeCasting;
        testAutoTypeCasting = (int) testLoginAutoTypeCasting;

    }
}
