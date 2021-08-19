package Service;

import Api.Student;
import DAO.StudentDAOimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("studentDaoHelper")
public class StudentDAOHelper {
    @Autowired
    private StudentDAOimpl studentDAOimpl;
    public void setUpStudentTable(){
        Student student1 = new Student();
        student1.setRoolNo(1);
        student1.setName("Ngoc");
        student1.setAddress("HaNoi");
        Student student2 = new Student();
        student2.setRoolNo(2);
        student2.setName("Ngoc2");
        student2.setAddress("HaNoi2");
        Student student3 = new Student();
        student3.setRoolNo(3);
        student3.setName("Ngoc3");
        student3.setAddress("HaNoi3");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        studentDAOimpl.insert(list);
    }

    public void printStudents(List<Student> students){
        for(Student i:students){
            System.out.println(i);
        }
    }

}
