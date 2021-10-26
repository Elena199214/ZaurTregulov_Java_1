package Lesson12andHomework;

import Lesson11andHomework.Student;

/**
 * 1. В классе StudentTest написать 2 метода, которые принимают 2 input параметра-2 объекта класса Student из Lesson11. Первый метод сравнивает
 * 2-х студентов, используя 1 if statement и логические операторы внутри него и выводит на экране информацию о том, равны ли студенты. Второй
 * метод использует nested if statement, сравнивает все атрибуты студента по отдельности, выводит на экран на информацию о том, равны ли студенты,
 * а если не равны, то в чем именно было обнаружено первое неравенство.
 */

public class StudentTest {

    public static void main(String[] args) {

        StudentTest st = new StudentTest();
       Student st1 = new Student ("Vasy",2,5);
       Student st2 = new Student("Vasy",2, 5);

        st.compareObject(st1,st2);
        st.compareAttributes(st1,st2);
    }

    public void compareObject(Student student1, Student student2) {
        //if (student1.equals(student2)) мой вариант + переопределен equals and hashCode
        if(student1.getName().equals(student2.getName()) && student1.getCourse()==student2.getCourse() && student1.getGrade() == student2.getGrade()) {
            System.out.println("студенты равны");
        } else {
            System.out.println("студенты не равны");
        }

    }

    public void compareAttributes(Student student1, Student student2) {

        if (student1.getName().equals(student2.getName())) {
            if (student1.getCourse() == student2.getCourse()) {
                if (student1.getGrade() == student2.getGrade()) {
                    System.out.println("Студенты равны по всем параметрам");
                } else{
                        System.out.println("У студентов разные оценки");
                    }
                } else {
                    System.out.println("У студентов разные курсы");
                }

            } else {
                System.out.println("У студентов разные имена");
            }
        }
    }


