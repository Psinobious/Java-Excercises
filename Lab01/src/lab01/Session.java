/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 * This class is used to store the various sessions linking student and course
 * together via indirect referencing
 * @author Daniel Johnson
 */
public class Session {

    private String sessionID, studentID, courseID, startDate, endDate;
    /**
     * default constructor
     */
    public Session(){
        sessionID = "";
        studentID = "";
        courseID = "";
        startDate = "";
        endDate = "";
    }
    /**
     * user defined constructor
     * @param sessionID
     * @param studentID
     * @param courseID
     * @param startDate
     * @param endDate 
     */
    public Session(String sessionID, String studentID, String courseID, String startDate, String endDate){
        this.sessionID = sessionID;
        this.studentID = studentID;
        this.courseID = courseID;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    /**
     * retrieves session ID
     * @return sessionID
     */
    public String getSessionID() {
        return sessionID;
    }
    /**
     * sets session ID
     * @param sessionID 
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }
    /**
     * retrieves studentID
     * @return studentID
     */
    public String getStudentID() {
        return studentID;
    }
    /**
     * sets student ID
     * @param studentID 
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    /**
     * retrieves course ID
     * @return courseID
     */
    public String getCourseID() {
        return courseID;
    }
    /**
     * sets courseID
     * @param courseID 
     */
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    /**
     * retrieves start date
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }
    /**
     * sets start date
     * @param startDate 
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    /**
     * retrieves end date
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }
    /**
     * sets endDate
     * @param endDate 
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    /**
     * returns object information
     * @return 
     */
    @Override
    public String toString() {
        return "Session{" + "sessionID=" + sessionID + ", studentID=" + studentID + ", courseID=" + courseID + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
    
}
