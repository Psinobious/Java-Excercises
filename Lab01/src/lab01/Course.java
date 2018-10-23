/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 * This class is used to create the course object that will be used for sessions
 * @author Daniel Johnson
 */
public class Course {
    private String courseID, courseName;
    private int credits;
    /**
     * default constructor
     */
    public Course(){
        this.courseID = "";
        this.courseName = "";
        this.credits = 0;
    }
    /**
     * User defined constructor
     * @param courseID
     * @param courseName
     * @param credits 
     */
    public Course(String courseID, String courseName, int credits){
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
    }
    /**
     * retrieves course ID
     * @return courseID
     */
    public String getCourseID() {
        return courseID;
    }
    /**
     * sets course ID
     * @param courseID 
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    /**
     * retrieves course name
     * @return courseName
     */
    public String getCourseName() {
        return courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    /**
     * retrieves credits
     * @return credits
     */
    public int getCredits() {
        return credits;
    }
    /**
     * changes credits
     * @param credits 
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    /**
     * returns object information
     * @return 
     */
    @Override
    public String toString() {
        return "Course{" + "courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits + '}';
    }
    
    
}
