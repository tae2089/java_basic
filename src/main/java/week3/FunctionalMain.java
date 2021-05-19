package week3;

import java.util.ArrayList;
import java.util.List;

public class FunctionalMain {
    public static void main(String[] args) {
        // 이 페이지는 java 8버전에서 부터 생긴 Functional 인터페이스에 대한 부분입니다.
        List<Person> people = new ArrayList();

    }

    class Person {
        private String name;
        private GENDER gender;

        Person(String name, GENDER gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum GENDER {
        MALE, FEMALE;
    }
}
