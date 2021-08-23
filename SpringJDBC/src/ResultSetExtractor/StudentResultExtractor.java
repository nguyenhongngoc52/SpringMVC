package ResultSetExtractor;

import Api.Student;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentResultExtractor implements ResultSetExtractor<List<Student>> {

    @Override
    public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
        // do nhan duoc tat ca cac ban ghi cung luc nen chung ta can su dung vong lap while

        List<Student> studentList = new ArrayList<Student>();
        while (rs.next()) {
            Student student = new Student();
            student.setRoolNo(rs.getInt("Rool_No"));
            student.setName(rs.getString("STUDENT_NAME"));
            student.setAddress(rs.getString("STUDENT_ADDRESS"));
                studentList.add(student);
        }
        System.out.println("inside the extracData().... method");
        return studentList;
    }
}
