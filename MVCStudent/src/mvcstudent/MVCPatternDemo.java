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
public class MVCPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();
        
        controller.setStudentName("John Doe");
        
        controller.updateView();
    }
    
    public static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("John Wick");
        student.setRollNo("1");
        return student;
    }
}
    
