package HomeWork4;

/**
 * Создайте 2 класса. 1-й назовите Student. Он должен содержать в себе следующие атрибуты: номер
 * студенческого билета, имя, фамилию, год обучения, средняя оценка по математике, средняя оценка по экономике,
 * средняя оценка по иностранному языку. 2-й класс назовите StudentTest. В нем вы должны будете создать 3 разных объекта класса Student
 * вывестм на экран в читабельном виде среднюю арифметическую оценку каждого студента (учитывая все 3 предмета)
 */


// * #2 Измените класс Student так, чтобы он имел 3 конструктора.1-й принимает все паоаметры. 2-й - только id, name, surname, course.
// * 3-й не принимает значений. Создайте в классе StudentTest 3 объекта с помощью разных конструкторов.
public class Student {
    String studentTicket;
    String name;
    String surname;
    String yearOfStudy;
    double mathScore;
    double economicsScore;
    double languageScore;


     double srednyyArifmeticheskay(Student student){
        double result =  (student.mathScore+student.languageScore+student.economicsScore)/3;
        System.out.println("Средняя арифметическая оценка студента "+ student.name + " " + result);
        return result;
    }

}


//#2 Измените класс StudentTest так, чтобы среднюю арифметическую оценку студента выводил на экран метод. Т.е. создайте 1 метод,
// * параметр которого - это объект класса Student, а в теле мпетода будет вычисляться средняя арифметическая оценка и выводиться на экран.

class StudentTest {
    public static void main(String[] args) {


    Student student1 = new Student();
    Student student2 = new Student();
    Student student3 = new Student();


    student1.studentTicket = "111";
    student2.studentTicket = "222";
    student3.studentTicket = "333";

    student1.name = "Nick";
    student2.name = "Peter";
    student3.name = "Tom";

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
        System.out.println(student2.name + " " + result2);
        System.out.println(student3.name + " " + result3);
        student1.srednyyArifmeticheskay(student1);
}
}