/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import Service.StudentService;
import Entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author os_conght
 */
public class DEMO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        //exception return null  
        //BAD 
        StudentService service = new StudentService();
        List<Student> students = service.getStudents();
        if (students != null) {
            for (Student student : students) {
                System.out.println("student found: " + student.getName());
            }
        }
        service.updateStudentBad("1");

        //GOOD
        students = service.getUsers();
            for (Student student : students) {
                System.out.println("student found: " + student.getName());
            }
       
        service.updateStudentGood("1");

    }

}
