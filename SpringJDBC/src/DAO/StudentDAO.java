package DAO;

import Api.Student;

import java.util.List;

public interface StudentDAO {
    void insert(Student student);

    void insert(List<Student> studentList);

    List<Student> findAllStudent();

    boolean deleteRecordByRollNo(int rollNo);

    int deleteByStudentNameAndStudentAddress(String studentName, String studentAddress);

    void cleanUp();

    Student fidnStudentByRollNo(int roolNo);
}
