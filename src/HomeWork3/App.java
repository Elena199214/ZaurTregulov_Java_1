package HomeWork3;

/**
 * #1
 * Вычислите следущую часть кода:
 * int i1=5;
 * int i2=11;
 * double d1 =5.5;
 * double d2 =1.3;
 * long l=20l;
 * double result =0;
 * result = i2/d1+d2%i1-l;
 */
public class App {
    public static void main(String[] args) {


    int i1 = 5;
    int i2 = 11;
    double d1 = 5.5;
    double d2 = 1.3;
    long l = 20l;
    double result = 0;

        result = i2 / d1 + d2 % i1 - l;
        //        11/5,5 + 1,3 % 5 - 20
        //        2+1,3 -20 = 16.7

        double s = d2 % i1;
        System.out.println(result);

        /**
         * №2
         * Чему равны выражения:
         * a-- - --a + ++a + a++ + a; где a=5
         * ++b - b++ + ++b - --b; где b=8
         */


    int a = 5;
    int b = 8;

    int resultA = a-- - --a + ++a + a++ + a;
                //5-3+4+4+5 = 15
    int resultB = ++b - b++ + ++b - --b;
                // 9-9+11-10= 1
        System.out.println(resultA);
        System.out.println(resultB);
}
}
