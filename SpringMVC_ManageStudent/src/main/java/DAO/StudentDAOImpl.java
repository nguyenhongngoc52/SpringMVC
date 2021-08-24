package DAO;

import API.Student;
import RowMapper.StudentMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> loadStudent() {
        String sql = "SELECT * FROM students";

        List<Student>  studentList = jdbcTemplate.query(sql,new StudentMapper());

        return studentList;
    }
}
