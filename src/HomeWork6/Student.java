package HomeWork6;


    // * #2 Измените класс Student так, чтобы он имел 3 конструктора.1-й принимает все паоаметры. 2-й - только id, name, surname, course.
// * 3-й не принимает значений. Создайте в классе StudentTest 3 объекта с помощью разных конструкторов.
    public class Student {
        String studentId;
        String name;
        String surname;
        String curse;
        double mathScore;
        double economicsScore;
        double languageScore;


        public Student() {
        }

        public Student(String studentId, String name, String surname, String curse, double mathScore, double economicsScore, double languageScore) {
            this(studentId,name,surname,curse);
            this.mathScore = mathScore;
            this.economicsScore = economicsScore;
            this.languageScore = languageScore;
        }

        public Student(String studentId, String name, String surname, String curse) {
            this.studentId = studentId;
            this.name = name;
            this.surname = surname;
            this.curse = curse;
        }
    }


//#2 Измените класс StudentTest так, чтобы среднюю арифметическую оценку студента выводил на экран метод. Т.е. создайте 1 метод,
// * параметр которого - это объект класса Student, а в теле мпетода будет вычисляться средняя арифметическая оценка и выводиться на экран.

        class StudentTest {
            public static void main(String[] args) {


                Student student1 = new Student();
                Student student2 = new Student("123","Ivan","Ivanov","4");
                Student student3 = new Student("234","Liza","Ivanova","5",4.5,5,4);
            }

        }




