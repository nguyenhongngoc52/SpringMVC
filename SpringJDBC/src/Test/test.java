package Test;

import Api.Student;
import DAO.StudentDAO;
import DAO.StudentDAOimpl;
import Service.StudentDAOHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("application context loaded....");
        StudentDAOHelper studentDAOHelper = context.getBean("studentDaoHelper",StudentDAOHelper.class);
        StudentDAOimpl studentDAOimpl = context.getBean("studentDao", StudentDAOimpl.class);
        studentDAOHelper.setUpStudentTable();
//        Student student = new Student();
//        student.setRoolNo(2);
//        student.setName("Ngoc");
//        student.setAddress("HN");
//        studentDAOimpl.insert(student);

//        boolean isDelete = studentDAOimpl.deleteRecordByRollNo(2);
//        if(isDelete){
//            System.out.println("Da xoa thanh cong ");
//        }
//        studentDAOimpl.deleteByStudentNameAndStudentAddress("Ngoc","Vinh");
        List<Student> studentList = studentDAOimpl.findAllStudent();
        studentDAOHelper.printStudents(studentList);
        System.out.println("xuat ra thong tin hang thu 2 :");
        Student student =studentDAOimpl.fidnStudentByRollNo(2);
        System.out.println(student);
        studentDAOimpl.cleanUp();

    }
}
