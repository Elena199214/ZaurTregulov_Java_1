package HomeWork5;

/**
 * #1 В класс BankAccount добавьте 2 метода. Первый метод называется popolnenieScheta и увеличивает баланс на сумму,
 * которая указана в параметре этого метода. Второй метод называется snytieSoScheta и уменьшает баланс на сумму,
 * которая указана в параметре этого метода.
 * #2 Измените класс StudentTest так, чтобы среднюю арифметическую оценку студента выводил на экран метод. Т.е. создайте 1 метод,
 * параметр которого - это объект класса Student, а в теле мпетода будет вычисляться средняя арифметическая оценка и выводиться на экран.
 * #3 Создайте класс Employee с атрибутами id, surname, age, salary, department, которые должны задаваться в конструкторе. Вданном классе
 *  также создайте метод увеличения зарплаты вдвое. Создайте второй класс EmploeeTest в котором создайте 2 объекта класса Employee.
 *  Увеличьте зарплату каждому работнику вдвое с помощью метода и выведите на экран значение новой зарплаты.
 */

public class BankAccount {
    int id = 1;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
    }

    double popolnenieScheta (double summa){
        balance += summa;
        return balance;
    }

   double snytieSoScheta (double summa){
       balance -= summa;
       return balance;
   }
}
