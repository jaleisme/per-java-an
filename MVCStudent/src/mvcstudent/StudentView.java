/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcstudent;

/**
 *
 * @author FAIZAL
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("[ Student Info ]");
        System.out.println("| Name : "+studentName);
        System.out.println("| Roll No : "+studentRollNo+"\n");
    }
}