package week3;

import java.util.ArrayList;
import java.util.List;

public class FunctionMain {
    public static void main(String[] args) {
        // 이 페이지는 java 8버전에서 부터 생긴 Functional 인터페이스에 대한 부분입니다.
        System.out.println(add(1, 2));

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    static void multiple(int a, int b) {
        System.out.println(a * b);
    }

    static int createData() {
        return 1;
    }
}
