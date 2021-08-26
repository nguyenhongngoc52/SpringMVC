package Service;

import API.Student;

import java.util.List;

public interface StudentService {
    List<Student> loadStudent();
    void saveStudent(Student student);
    Student getStudent(int id);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
