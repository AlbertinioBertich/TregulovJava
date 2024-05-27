package Lesson9;

public class TestOne {
    int a = 1;
    static int b = 2; // переменная a уже существует

    public void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }
}
