package HomeWork7;

/**
 * Пересоздайте класс Employee таким образом, чтобы переменная salary была недоступна вне класса, переменная surname была доступна отовсюду,
 * а переменная id только внутри пакета. Также создайте 3 public метода, которые будут показывать на дисплее значения этих переменных.
 * Создайте для данного класса 3 разных констректора с  public, default и private access modifier-ами. В конструкторах присваивайте переменным
 * класса значения из параметров. Создайте новые классы в том же и в другом пакете. Попытайтесь в них создать объекты класса Employee и вывести
 * на экран значения переменных данного объекта с помощью метода println и методов самого класса.
 */
public class EmployeeTest {
    public static void main(String[] args) {


    Employee emp1 = new Employee(50);
    Employee emp2 = new Employee("Smirnov");
    Employee emp3 = new Employee(40000.0);
    emp1.showId();
    emp1.showSurname();
    emp1.showSalary();



        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        System.out.println(emp1.salary);

}
}
