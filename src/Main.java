import Lesson8.FirstClass;
import Lesson9.Test;
import Lesson9.TestOne;

import static Lesson9.Test.add;

public class Main {

    public static void main(String[] args) {
        System.out.println(FirstClass.multiplication(2,3,5));
        FirstClass.division(7,4);
        FirstClass fc = new FirstClass();
        System.out.println(fc.square(5.3));
        System.out.println(FirstClass.length(4));
        fc.showInfo(5);

        Test tst = new Test("Существует");
        add(); // локальный, существует только внутри метода add
        add(); // локальный, существует только внутри метода add
        Test tst1 = new Test("Существует");
        add(); // локальный, существует только внутри метода add

        TestOne test = new TestOne();
        test.abc(5);
    }
}