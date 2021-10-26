package Lesson12andHomework;

public class Test10 {
    void maximum(int i1, int i2, int i3){
        if (i1>i2 && i1 >i3){
            System.out.println("Maximum - " +i1);
        }
        else if(i2>i1 && i2 >i3){
            System.out.println("Maximum - " +i2);
        }
        else{
            System.out.println("Maximum - " +i3);
        }
    }
    void abc(){
        String str;
        int a=10;
        if(a>=10){
            str = "Hello";
        }
        if (a<10){
            str= "by";
            System.out.println(str);
        }
        else {
            str = "fthdh";
        }
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        t.maximum(4,7,0);

        int a=10;
        int b=20;
        int maximum1 = (a>b)?a:b;
        System.out.println(maximum1);
    }
}
