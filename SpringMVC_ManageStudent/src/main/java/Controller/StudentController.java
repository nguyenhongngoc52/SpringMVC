package Controller;

import API.Student;
import DAO.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


//day la lop presentation layer
@Controller
public class StudentController {
    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/showStudent")
    public String showStudentList(){
          List<Student> studentList =  studentDAO.loadStudent();
        return "student-list";
    }
}
