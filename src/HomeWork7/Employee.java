package HomeWork7;
/**
 * Пересоздайте класс Employee таким образом, чтобы переменная salary была недоступна вне класса, переменная surname была доступна отовсюду,
 * а переменная id только внутри пакета. Также создайте 3 public метода, которые будут показывать на дисплее значения этих переменных.
 * Создайте для данного класса 3 разных констректора с  public, default и private access modifier-ами. В конструкторах присваивайте переменным
 * класса значения из параметров. Создайте новые классы в том же и в другом пакете. Попытайтесь в них создать объекты класса Employee и вывести
 * на экран значения переменных данного объекта с помощью метода println и методов самого класса.
 */
public class Employee {
    int id;
    public String surname;
    private double salary;


    public void show(){
        System.out.println("id:" + id + " surname:" +surname + " salary:" + salary );

    } public void showId(){
        System.out.println("id:" + id );

    } public void showSurname(){
        System.out.println("surname:" +surname);

    } public void showSalary(){
        System.out.println("salary:" + salary );
    }

     Employee(int id) {
        this.id = id;


    }
    public Employee(String surname) {
        this.surname = surname;


    } private Employee(double salary) {
        this.salary = salary;
    }
}

