package epam.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Igor Ch", 5, 8.9);
        Student st2 = new Student("Igor Ivanov", 3, 7.8);
        Student st3 = new Student("Elena Golovach", 1, 3.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("getStudents method start working");
//        System.out.println(students.get(3));
        System.out.println("Inf from method getStudents : ");
        System.out.println(students);
        return students;
    }


}
