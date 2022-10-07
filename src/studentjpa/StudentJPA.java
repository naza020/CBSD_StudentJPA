/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentjpa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author theki
 */
public class StudentJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std1 = new Student(1, "John", 3.0);
        Student std2 = new Student(2, "Marry", 2.0);
        StudentTable.insertStudent(std1);
        StudentTable.insertStudent(std2);
//        Student std;
//        std = StudentTable.findStudentById(1);
//        if (std != null) {
//            std.setName("Jackky");
//        StudentTable.removeStudent(std);
//            StudentTable.updateStudent(std);
//        }
//        List<Student> stdList = StudentTable.findStudentByName("Marry"); 
        List<Student> stdList = StudentTable.findAllStudent();
        printAllStudent(stdList);
    }

    public static void printAllStudent(List<Student> stdList) {
        for (int i = 0; i < stdList.size(); i++) {
            System.out.print(stdList.get(i).getId() + " ");
            System.out.print(stdList.get(i).getName() + " ");
            System.out.println(stdList.get(i).getGpa() + " ");
        }

    }

}
