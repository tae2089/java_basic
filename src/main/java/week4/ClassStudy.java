package week4;

public class ClassStudy {

    public static void main(String[] args) {
        // 객체 생성하기
        Person person = new Person();
        Person2 person2 = new Person2("Boaz", 15);

        // toString 사용해보기
        System.out.println(person.toString());
        System.out.println(person2.toString());

        // overloading 사용해보기
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(5.0, 5.0));
    }

}

// 파일명이 다른 곳에서 클래스 생성하기
class Person2 {
    private String name;
    private int age;

    // 생성자 default noargsconstructor
    public Person2() {
    }

    // 생성자 allargsconstructor
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        this.age = age;
    }
}