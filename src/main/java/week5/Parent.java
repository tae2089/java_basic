package week5;

public class Parent implements Buy{
    private String name;
    private int age;
    public void call(){
        System.out.println("hello i'm parent");
    }

    @Override
    public void buyCar() {
        System.out.println("차를 샀다");

    }

    @Override
    public void buyBook() {
        System.out.println("책을 샀다");
    }
}
