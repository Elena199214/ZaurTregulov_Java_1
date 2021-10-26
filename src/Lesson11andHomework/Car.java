package Lesson11andHomework;

/**
 *  №1 Создайте класс Car с тремя переменными: цвет, мотор и количество дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
 *  1-й изменяет количество дверей объекта класса Car на количество, прописанное в параметре метода. 2-й принимает в параметры 2 объекта класса Car
 *  и меняет их цвета местами. Примените оба метода в main и выведите на экран атрибуты всех объектов.
 */

public class Car {
   String color;
   private int motor;
   int door;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", motor=" + motor +
                ", door=" + door +
                '}';
    }

    public Car(String color, int motor, int door) {
        this.color = color;
        this.motor = motor;
        this.door = door;
    }

}
class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car("white", 2, 2);
        Car car2 = new Car("red", 3, 4);

        CarTest carTest = new CarTest();

      changeDoors(car1 ,9);
      changeColor(car1,car2);
        System.out.println(car1.toString());
        System.out.println(car2.toString());




    }

   public static int changeDoors(Car car, int door){
      car.door = door;
       return door;
   }
   public static void changeColor (Car car1, Car car2){
        Car car3 = new Car("",2,0);
        car3.color = car1.color;
        car1.color = car2.color;
        car2.color = car3.color;
   }



}

