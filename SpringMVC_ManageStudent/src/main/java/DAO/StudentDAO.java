package DAO;

import API.Student;

import java.util.List;


//data access layer
public interface StudentDAO {
    List<Student> loadStudent();
}
