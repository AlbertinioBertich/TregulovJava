import Lesson8.FirstClass;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstClass.multiplication(2,3,5));
        FirstClass.division(7,4);
        FirstClass fc = new FirstClass();
        System.out.println(fc.square(5.3));
        System.out.println(FirstClass.length(4));
        fc.showInfo(5);
    }
}