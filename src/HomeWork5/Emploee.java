package HomeWork5;
//* #3 Создайте класс Employee с атрибутами id, surname, age, salary, department, которые должны задаваться в конструкторе. В данном классе
// *  также создайте метод увеличения зарплаты вдвое. Создайте второй класс EmploeeTest в котором создайте 2 объекта класса Employee.
// *  Увеличьте зарплату каждому работнику вдвое с помощью метода и выведите на экран значение новой зарплаты.
// */

public class Emploee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Emploee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double salaryDouble(){
       salary *= 2;
       return salary;
    }
}

class EmploeeTest{
    public static void main(String[] args) {
        Emploee emploee1 = new Emploee(123,"Chunosova", 40, 25000, "sale");
        Emploee emploee2 = new Emploee(456,"Medvedeva", 30, 30000, "sale");

        emploee1.salaryDouble();
        emploee2.salaryDouble();

        System.out.println("Зарплата работника "+ emploee1.surname + " составила " + emploee1.salary + ". Зарплата работника "+ emploee2.surname + " составила " + emploee2.salary);
    }
}

