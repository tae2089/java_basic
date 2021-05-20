package week4;

public class ClassStudy {

    public static void main(String[] args) {
        Person person = new Person();
        Person2 person2 = new Person2("Boaz", 15);
    }

}

// 파일명이 다른 곳에서 클래스 생성하기
class Person2 {
    private String name;
    private int age;

    public Person2() {
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}