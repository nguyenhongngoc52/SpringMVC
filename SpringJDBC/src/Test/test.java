package Test;

import Api.Student;
import DAO.StudentDAO;
import DAO.StudentDAOimpl;
import Service.StudentDAOHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("application context loaded....");
        StudentDAOHelper studentDAOHelper = context.getBean("studentDaoHelper",StudentDAOHelper.class);
        StudentDAOimpl studentDAOimpl = context.getBean("studentDao", StudentDAOimpl.class);
//        studentDAOHelper.setUpStudentTable();
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
//        List<Student> studentList = studentDAOimpl.findAllStudent();
//        studentDAOHelper.printStudents(studentList);
//        System.out.println("xuat ra thong tin hang thu 2 :");
//        Student student =studentDAOimpl.fidnStudentByRollNo(2);
//        System.out.println(student);
//        List<Student> studentList1 = studentDAOimpl.findStudentByName("Ha");
//        studentDAOHelper.printStudents(studentList1);
//
//        Map<String , List<String>> groupStudentByAddress =studentDAOimpl.groupStudentByAddress();
//        System.out.println(groupStudentByAddress);

//        studentDAOimpl.cleanUp();

        Student Ngoc1 = new Student();
        Ngoc1.setRoolNo(1);
        Ngoc1.setAddress("Vinh Phuc111");
        Student Ngoc2 = new Student();
        Ngoc2.setRoolNo(2);
        Ngoc2.setAddress("Vinh Phuc222");
        Student Ngoc3 = new Student();
        Ngoc3.setRoolNo(3);
        Ngoc3.setAddress("Vinh Phuc33333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        List<Student> studentList = new ArrayList<>();
        studentList.add(Ngoc1);
        studentList.add(Ngoc2);
        studentList.add(Ngoc3);
        studentDAOimpl.updateStudent(studentList);

    }
}
