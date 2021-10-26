package Lesson11andHomework;

import java.util.Objects;

public class Student {
    String name;
    int course;
    double grade;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1=s2;
        s2=s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student s1){
        s1.name = "Vasiliy";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getCourse() == student.getCourse() && Double.compare(student.getGrade(), getGrade()) == 0 && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourse(), getGrade());
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",3, 9.5);
        Student st2 = new Student("Petr", 1,5.3);

        changeName(st2);
        System.out.println(st2.name);
    }

}
