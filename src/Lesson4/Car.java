package Lesson4;

public class Car {  // referens data type любой класс
    String color = "red"; // instance variables у каждого объекта своя внутри класса создаются
    String engine = "V6";
    }

    class CarTest{
        public static void main(String[] args) {
            Car car3; // переменная без ссылки на объект
            Car car1 = new Car(); // был создан новый объект
            Car car2 = car1; // новая ссылка на объект выше

            System.out.println(new Car().color);// создали объект без переменной, сможем использовать только один раз
        }
    }
