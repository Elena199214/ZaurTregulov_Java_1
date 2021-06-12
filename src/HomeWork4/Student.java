package HomeWork4;

/**
 * Создайте 2 класса. 1-й назовите Student. Он должен содержать в себе следующие атрибуты: номер
 * студенческого билета, имя, фамилию, год обучения, средняя оценка по математике, средняя оценка по экономике,
 * средняя оценка по иностранному языку. 2-й класс назовите StudentTest. В нем вы должны будете создать 3 разных объекта класса Student
 * вывестм на экран в читабельном виде среднюю арифметическую оценку каждого студента (учитывая все 3 предмета)
 */

public class Student {
    String studentTicket;
    String name;
    String surname;
    String yearOfStudy;
    double mathScore;
    double economicsScore;
    double languageScore;


}
class StudentTest {
    public static void main(String[] args) {


    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();

    student1.studentTicket = "111";
    student2.studentTicket = "222";
    student3.studentTicket = "333";

    student1.name = "Nick";
    student1.name = "Peter";
    student1.name = "Tom";

    student1.mathScore = 4;
    student2.mathScore = 5;
    student3.mathScore = 3;

    student1.economicsScore = 5;
    student2.economicsScore = 4;
    student3.economicsScore = 3;

    student1.languageScore = 5;
    student2.languageScore = 4;
    student3.languageScore = 5;

    double result1 =  (student1.mathScore+student1.languageScore+student1.economicsScore)/3;
    double result2 =  (student2.mathScore+student2.languageScore+student2.economicsScore)/3;
    double result3 =  (student3.mathScore+student3.languageScore+student3.economicsScore)/3;


        System.out.println(student1.name + " " + result1);
        System.out.println(student1.name + " " + result2);
        System.out.println(student1.name + " " + result3);

}
}