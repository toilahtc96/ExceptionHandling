/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author os_conght
 */
public class StudentService {
//BAD

    public List<Student> getStudents() {
        List<Student> studentsFromDb = getStudentsFromDatabase();
        if (studentsFromDb == null) {
            // No students found in database
            return null;
        } else {
            return studentsFromDb;
        }
    }

    public List<Student> getStudentsFromDatabase() {
        List<Student> lstStudentDb = new ArrayList<>();
        return null;
//        return lstStudentDb;

    }

    //GOOD
    public List<Student> getUsers() {
        List<Student> studentsFromDb = getStudentsFromDatabase();
        if (studentsFromDb == null) {
            // No users found in database
            return new ArrayList<Student>();
        } else {
            return studentsFromDb;
        }
    }

    //BAD 
    public boolean updateStudentBad(String id) {
        //
        Student student = getStudentById(id);
        if (student == null) {
            return false;
        }
        updateToDB();
        return true;
    }

    //GOOD 
    public void updateStudentGood(String id) throws Exception {
        Student student = getStudentById(id);
        if (student == null) {
            throw new Exception("404");
        }
        updateToDB();

    }

    public void updateToDB() {
        System.out.println("Update Success");
    }

    public Student getStudentById(String id) {
//        return new Student();
        return null;
    }

}
