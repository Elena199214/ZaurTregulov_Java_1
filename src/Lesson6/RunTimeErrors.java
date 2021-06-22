package Lesson6;

/**
 * Method overloading(перегрузка методов) имена одинаковые, а параметры list разные.
 * Constructor overloading параметры лист разные
 * this statement только с помощью него можем вызвать перегруженный конструктор и он всегда должен стоять на первом месте
 * Runtime(возникает после запуска) & Compile time error(обнаруживает компилятор)
 */

public class RunTimeErrors {
    public static void main(String[] args) {
        int a = 50/0;
    }
}
