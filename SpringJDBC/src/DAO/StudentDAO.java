package DAO;

import Api.Student;

import java.util.List;
import java.util.Map;

public interface StudentDAO {
    void insert(Student student);

    void insert(List<Student> studentList);

    List<Student> findAllStudent();

    List<Student> findStudentByName(String name);

    boolean deleteRecordByRollNo(int rollNo);

    int deleteByStudentNameAndStudentAddress(String studentName, String studentAddress);

    void cleanUp();

    Student fidnStudentByRollNo(int roolNo);

    Map<String , List<String>> groupStudentByAddress();


}
