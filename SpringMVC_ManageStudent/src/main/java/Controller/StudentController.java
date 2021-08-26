package Controller;

import API.Student;
import DAO.StudentDAO;
import DTO.StudentDTO;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//day la lop presentation layer
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/showStudent")
    public String showStudentList(Model model) {
        List<Student> studentList = studentService.loadStudent();
//          for (Student i:studentList){
//              System.out.println(i);
//          }
        model.addAttribute("students", studentList);
        return "student-list";
    }

    @GetMapping("/showAddStudentPage")
    public String showAddStudent(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }


    @PostMapping("/save-student")
    public String saveStudent(Student student) {
        if (student.getId() == 0) {
            studentService.saveStudent(student);
        } else {
            studentService.updateStudent(student);
        }

        return "redirect:/showStudent";
    }

    @GetMapping("/updateStudent")
    public String updateStudent(@RequestParam("userID") int id, Model model) {
        Student myStudent = studentService.getStudent(id);
        model.addAttribute("student", myStudent);

        return "add-student";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("userID") int id) {
            studentService.deleteStudent(id);
        return "redirect:/showStudent";
    }
}
