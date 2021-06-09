package HomeWork2;

public class App {
    public static void main(String[] args) {
    //десятиричная decimal
    byte b1 = 12;
    short s1 = 1300;
    int i = 0;
    long l = 123456789L;
    float f = 12.5f;
    double d = 12.4;
    float f2 = 12;
    double d2= 12.4d;


    char c = '1';
    char c1 = 500;
    char c2 = '\u05AB';

    boolean bol = true;

    //восьмиричная/ octal
        byte b2 = 014;
        short s2 = 02424;
        int i2 = 0;
        long l2 = 0726_746_425L;

    // двоичная /бинарная /binary
        byte b3 = 0b1100;
        short s3 = 0b0101_0001_0100;
        int i3 = 0;
        long l3 = 0b0111_0101_1011_1100_1101_0001_0101;

    // шестнадцатиричная hexadecimal
        byte b4 = 0xc;
        short s4 = 0x514;
        int i4 = 0;
        long l4 = 0x75BCD15;



    int a1 = 200000000;
    int a2 = 200000000;
    int result = a1 + a2;
    int result2 = 200000000 + 200000000;


        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        System.out.println(i + " " + i2 + " " + i3 + " " + i4);
        System.out.println(l + " " + l2 + " " + l3 + " " + l4);
        System.out.println(f + " " + d + " " + f2 + " " + d2 + " " + bol);
        System.out.println(c + " " + c1 + " " + c2);

        System.out.println(result2);
    }
}