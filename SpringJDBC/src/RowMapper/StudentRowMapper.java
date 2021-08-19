package RowMapper;

import Api.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student newStudent = new Student();
        newStudent.setRoolNo(rs.getInt("Rool_No"));
        newStudent.setName(rs.getString("STUDENT_NAME"));
        newStudent.setAddress(rs.getString("STUDENT_ADDRESS"));
        System.out.println("mapRow() called...." );
        return newStudent;
    }
}
