package Lesson8;

public class FirstClass {

    public static final double pi = 3.14;

    public static int multiplication (int a, int b, int c){
        return a*b*c;
    }

    public static void division (int a, int b){
        int result = a/b;
        int ost = a%b;
        System.out.println("Целое: " + result + " Остаток: " + ost);
    }

    public double square (double r){
        return pi*r*r;
    }

    public static double length(double r){
        return 2*pi*r;
    }
    public void showInfo (double r){
        System.out.println("Радиус = " + r + ", Площадь круга = " + square(r)+ ", Длина окружности = " + length(r));
    }

    public static void main(String[] args) {
        System.out.println(multiplication(4,6,7));
        division(8,3);
    }

}
