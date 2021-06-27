package HomeWork8;
/**
 * №1. В первом классе создайте 2 static метода. 1-й пусть умножает 3 числа из параметра метода и возвращает их произведение; 2-й - делит первое число
 * из параметра на второе и ничего не возвращает, лишь выводит на дисплей в читабельном виде целое частное и остаток. Во втором классе по два раза
 * используйте данные методы.
 * №2. В первом классе создайте static final переменную Пи = 3,14. Используйте данную константу в non-static методе, который принимает в параметре
 * значение радиуса и вычисляет площадь круга по формуле: Площадь= Пи * радиус * радиус. Также используйте данную константу в static методе,
 * который принимает в параметре значение радиуса и вычисляет длину окружности по формуле: Площадь =  2 * Пи * радиус. Создайте еще один non-static метод,
 * который принимает в параметре значение радиуса и выводит на экран информацию о радиусе, площади круга и длине окружности. Используйте все 3 метода
 * во 2-м классе.
 */


public class FirstClass {

    static final double Pe = 3.14;

    static int proizvedenie3 (int a, int b, int c){
        return a*b*c;
    }

    static void delit (int a, int b){
        System.out.println("Целое частное: " + a/b + " остаток от деления: " + a%b);
    }

    double areaCircle(double radius){
        double area = 2 * Pe * radius;
        return area;
    }

    static double lengthArea(double radius) {
        double length = Pe * radius*radius;
        return length;
    }
    public void Show(double radius){
        System.out.println("Радиус равен: " + radius + " Площадь круга: " + areaCircle(radius) + " Длина окружности: "+  lengthArea(radius));
    }
}
class FirstClassTest{
    public static void main(String[] args) {
        System.out.println(FirstClass.proizvedenie3(1,2,3));
        System.out.println(FirstClass.proizvedenie3(2,2,2));
        FirstClass.delit(2,1);
        FirstClass.delit(5,3);

        System.out.println(FirstClass.lengthArea(3));

        FirstClass fir1 = new FirstClass();
        System.out.println(fir1.areaCircle(2.5));
        fir1.Show(1.5);

    }


}
