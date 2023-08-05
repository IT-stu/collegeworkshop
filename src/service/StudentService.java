package service;

import model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static void main(String... args){


    }

    public void addStudent(){
        Student io = new Student();
        List<Student> Studentlists = new ArrayList<Student>();
        io.setStudentId("0001");
        io.setName("Name");
        io.setCourse("IT");
        io.setStartDate("2022-08-22");
        io.setEndDate("2025-08-22");

    }

    public List<Student> getStudents(){
        return new ArrayList<Student>();
    }
}
