package DAO;

import API.Student;
import RowMapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> loadStudent() {
        String sql = "SELECT * FROM students";

        List<Student>  studentList = jdbcTemplate.query(sql,new StudentMapper());

        return studentList;
    }

    @Override
    public void saveStudent(Student student) {
        String sql = "INSERT INTO students(name,mobile,country) VALUES (?,?,?)";
        Object[] args = {student.getName(),student.getMobile(),student.getCountry()};
        int rowUpdate =jdbcTemplate.update(sql,args);
        System.out.println(rowUpdate);
    }

    @Override
    public Student getStudent(int id) {
        String sql = "SELECT * FROM students WHERE ID = ?";
        Student student = jdbcTemplate.queryForObject(sql,new StudentMapper(),id);
        return student ;
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name = ? , mobile = ? , country = ? WHERE id= ?";
        jdbcTemplate.update(sql,student.getName(),student.getMobile(),student.getCountry(),student.getId());
    }

    @Override
    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }
}
