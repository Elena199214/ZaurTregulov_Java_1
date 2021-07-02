package Lesson9andHomework;

/**
 * Scope of variables границы видимостей, переменные локальные ( внутри методов) переменные типа параметр, которые видны внутри всего метода, в то время как локальные видны только в части метода. instans переменные, которые пренадлежат объекту и статичные, которые пренадлежат всему классу
 * this statement означает отношение к текущему объекту this keyword при использовании с переменными и методами указывает на текущий экземпляр (объект) класса
 *  this keyword нельзя использовать для обращения к переменным и методам внутри static метода или при присваении значения static переменной
 *  Не является ошибочным образение с помощью this к static элементам, но не рекомендуется.
 * correct identifiers с заглавной или прописной буквы с нижнего подчеркивания или со знака валют, имеет любую длину
 * object's life cycle сколько живет объект, можем приравнять к null или по истечению метода main
 * Garbage collector Мы не можем определить какие объекты будут пригодны для того, чтобы garbage collector собрал их (удалил из памяти).
 * Мы не можем конкретно быть уверенны в том, что в определённое время garbage collector  удалит объект из памяти.
 * Мы не можем контролировать garbage collector и управлять им.
 * Управление garbage collector лежит на  JVM
 *
 *
 * №1 Напишите программу, в которой будет создано 8 объектов, но к последней строек метода  main останется всего 2.
 * № Вычислите устно output-ы данных программ, а затем проверьте в среде разработки
 */

public class App {
    public App() {
        System.out.println("объект создан");
    }

    public static void main(String[] args) {


        App app1 = new App();
        App app2 = new App();
        App app3 = new App();
        App app4 = new App();
        App app5 = new App();
        App app6 = new App();
        App app7 = new App();
        App app8 = new App();

        app1 = null;
        app2 = null;
        app3 = null;
        app4 = app8;
        app5 = app8;
        app6 = app8;

    }
}

class Test1{
    //int a = 1;
    static int a = 2;
    void  abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}

class Test2{
   int a = 1;
    static int b = 2;
    static void  abc(final int a){
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

class Test3{
    int a = 1;
    static int b = 2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}