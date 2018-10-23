/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 * This class is used to create the student object 
 * @author Daniel Johnson
 */
public class Student {
    private String studentID, firstName, lastName;
    /**
     * default constructor
     */
    public Student(){
        this.firstName = "";
        this.lastName = "";
        this.studentID = "";
    }
    /**
     * user defined constructor
     * @param studentID
     * @param firstName
     * @param lastName 
     */
    public Student(String studentID, String  firstName, String lastName){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /**
     * retrieves the student ID
     * @return studentID
     */
    public String getStudentID() {
        return studentID;
    }
    /**
     * sets the student ID
     * @param studentID 
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    /**
     * retrieves the first name of student
     * @return 
     */
    public String getFirsstName() {
        return firstName;
    }
    /**
     * sets the first name of student
     * @param firstName 
     */
    public void setFirsstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * retrieves the last name of student
     * @return 
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * sets the last name of student
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * displays the information of student
     * @return 
     */
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
}
