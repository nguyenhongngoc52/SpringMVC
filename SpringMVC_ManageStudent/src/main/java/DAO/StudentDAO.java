package DAO;

import API.Student;

import java.util.List;


//data access layer
public interface StudentDAO {
    List<Student> loadStudent();
    void saveStudent(Student student);
    Student getStudent(int id);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
