package DAO;

import Api.Student;
import ResultSetExtractor.StudentAddressExtractor;
import ResultSetExtractor.StudentResultExtractor;
import RowMapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.lang.model.type.ArrayType;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository("studentDao")
public class StudentDAOimpl implements StudentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insert(Student student) {
        String sql = "INSERT INTO STUDENT VALUES(?,?,?)";
        Object[] arg = {student.getRoolNo(), student.getName(), student.getAddress()};
        int numberOfRowInsert = jdbcTemplate.update(sql, arg);
        System.out.println("Number of row insert is :" + numberOfRowInsert);
    }

    @Override
    public void insert(List<Student> studentList) {
        String sql = " INSERT INTO STUDENT VALUES (?,?,?)";

        ArrayList<Object[]> sqlArgs = new ArrayList<>();

        for (Student i : studentList) {
            Object[] studentData = {i.getRoolNo(), i.getName(), i.getAddress()};
            sqlArgs.add(studentData);
        }
        jdbcTemplate.batchUpdate(sql, sqlArgs);
        System.out.println("cap nhat batch hoan tat ");
    }

    @Override
    public List<Student> findAllStudent() {
        String sql = "SELECT * FROM STUDENT";
        List<Student> studentList = jdbcTemplate.query(sql, new StudentRowMapper());

        return studentList;
    }

    @Override
    public List<Student> findStudentByName(String name) {
        String sql = "SELECT * FROM STUDENT WHERE STUDENT_NAME = ? ";
        List<Student> studentList = jdbcTemplate.query(sql, new StudentResultExtractor(), name);
        return studentList;
    }

    @Override
    public boolean deleteRecordByRollNo(int rollNo) {
        String sql = "DELETE FROM STUDENT WHERE Rool_No = ? ";
        int numberOfRowDelete = jdbcTemplate.update(sql, rollNo);
        System.out.println("So hang da xoa : " + numberOfRowDelete);
        return numberOfRowDelete == 1;
    }

    @Override
    public int deleteByStudentNameAndStudentAddress(String studentName, String studentAddress) {
        String sql = "DELETE FROM STUDENT WHERE STUDENT_NAME =? OR STUDENT_ADDRESS =?";
        Object[] arg = {studentName, studentAddress};
        int numberOfRowDelete = jdbcTemplate.update(sql, arg);
        System.out.println("so hang da duoc xoa : " + numberOfRowDelete);
        return numberOfRowDelete;
    }

    @Override
    public void cleanUp() {
        String sql = "TRUNCATE TABLE STUDENT";
        jdbcTemplate.update(sql);
        System.out.println("bang da duoc xoa thanh cong");
    }

    @Override
    public Student fidnStudentByRollNo(int roolNo) {
        String sql = "SELECT Rool_No as roolNo ,STUDENT_NAME as name , STUDENT_ADDRESS as address FROM STUDENT WHERE Rool_No=?";
        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class), roolNo);
        return student;
    }

    @Override
    public Map<String, List<String>> groupStudentByAddress() {
        String sql = "SELECT * FROM STUDENT";
        Map<String, List<String>> query = jdbcTemplate.query(sql, new StudentAddressExtractor());
        return query;
    }

    @Override
    public int updateStudent(Student student) {
        String sql = "UPDATE School.Student SET STUDENT_ADDRESS= ? WHERE ROOL_NO = ?";
        Object[] args = {student.getAddress(), student.getRoolNo()};
        int updateRow = jdbcTemplate.update(sql, args);

        System.out.println(updateRow);
        return updateRow;
    }

    @Override
    @Transactional
    public int updateStudent(List<Student> studentList) {
        String sql = "UPDATE School.Student SET STUDENT_ADDRESS = ? WHERE ROOL_NO = ?";
//        List<Object[]> studentListObject = new ArrayList<>();
//        for(Student i:studentList){
//            Object [] args = {i.getAddress() , i.getRoolNo()};
//            studentListObject.add(args);
//        }

        int[] Row = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, studentList.get(i).getAddress());
                ps.setInt(2, studentList.get(i).getRoolNo());
                System.out.println("inside method setValues().....");
            }

            @Override
            public int getBatchSize() {
                System.out.println("inside getBatch()...");
                return studentList.size();

            }
        });

        int RowUpdateCount = 0;
        for (int i = 0; i < Row.length; i++) {
            if (Row[i] == 1) {
                RowUpdateCount += 1;
            }

        }
        return RowUpdateCount;
    }


}
