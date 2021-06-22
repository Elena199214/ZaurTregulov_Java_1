package HomeWork6;

/**
 * #1 Создайте класс, в котором будут 5 overloaded методов, которые вычисляют сумму нуля, одного, двух, трех и четырех целых чисел соответственно,
 * передают эту сумму в output и выводят её на экран. В случае, когда слагаемые отсутствуют (т.е. когда параметров нет) сумма пусть равняется 0.
 * #2 Измените класс Student так, чтобы он имел 3 конструктора.1-й принимает все паоаметры. 2-й - только id, name, surname, course.
 * 3-й не принимает значений. Создайте в классе StudentTest 3 объекта с помощью разных конструкторов.
 */
 public class Overloaded {

    public int sum() {
        System.out.println(0);
        return 0;

    }

    public int sum(int a) {
        System.out.println(a);
        return a;

    }

    public int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;

    }

    public int sum(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;

    }

    public int sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
        return a + b + c + d;
    }
}

    class OverloadedTest{
        public static void main (String[]args){
            Overloaded ov = new Overloaded();
            ov.sum();
            ov.sum(1);
            ov.sum(1, 2);
        }
}

