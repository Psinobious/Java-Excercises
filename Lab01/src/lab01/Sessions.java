/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;
import java.util.Scanner;
/**
 * This class provides the menu interface of the program to the user.
 * @author Daniel Johnson
 */
public class Sessions {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean endTask = false;
        String response, firstName, lastName, studentID, courseName, courseID,
                startDate, endDate, sessionID;
        int credits;
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[4];
        for(int x = 0; x <students.length; x++){
            students[x] = new Student();
        }
        
        Course[] courses = new Course[10];
        for(int x = 0; x < courses.length; x++){
            courses[x] = new Course();
        }
        
        Session[] sessions = new Session[40];
        for(int x = 0; x < sessions.length; x++){
            sessions[x] = new Session();
        }
        do{
            
            System.out.println("1. Create Student"
                            + "\n2. Create Course"
                            + "\n3. Assign student courses"
                            + "\n4. Show Sessions"
                            + "\n5. Show Courses"
                            + "\n6. Show Students"
                            + "\n5. Exit");
            response = in.nextLine();
            switch(Integer.parseInt(response)){
                case 1:
                    for(int x = 0; x < students.length; x++){
                        if(students[x].getStudentID().compareTo("") == 0){
                            System.out.print("Enter first name: ");
                            firstName = in.nextLine();
                            System.out.print("\nEnter Last name: ");
                            lastName = in.nextLine();
                            System.out.println("Enter studentID: ");
                            studentID = in.nextLine();
                            students[x] = new Student(firstName, lastName, studentID);
                            break;
                        }
                    }
                    
                    break;
                case 2:
                    for(int x = 0; x < courses.length; x++){
                        if(courses[x].getCourseID().compareTo("") == 0){
                            System.out.println("Enter course name: ");
                            courseName = in.nextLine();
                            System.out.println("Enter course ID: ");
                            courseID = in.nextLine();
                            System.out.println("Enter credits: ");
                            credits = Integer.parseInt(in.nextLine());
                            courses[x] = new Course(courseID, courseName, credits);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Select student ID: ");
                    studentID = in.nextLine();
                    for(int x = 0; x < 4; x++){
                        System.out.println("Select course to add.");
                        courseID = in.nextLine();
                        System.out.println("Enter start date.");
                        startDate = in.nextLine();
                        System.out.println("Enter end date.");
                        endDate = in.nextLine();
                        System.out.println("Enter session ID.");
                        sessionID = in.nextLine();
                        for(int y = 0; y < sessions.length; y++){
                            if(sessions[y].getSessionID().compareTo("") == 0){
                                sessions[y] = new Session(sessionID, studentID, courseID, startDate, endDate);
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    for(int x = 0; x < sessions.length; x++){
                        if(sessions[x].getSessionID().compareTo("") != 0){
                            System.out.println(sessions[x].toString());
                        }
                    }
                    break;
                case 5:
                    for(int x = 0; x < courses.length; x++){
                        if(courses[x].getCourseID().compareTo("") != 0){
                            System.out.println(courses[x].toString());
                        }
                    }
                    break;
                case 6:
                    for(int x = 0; x < students.length; x++){
                        if(students[x].getStudentID().compareTo("") != 0){
                            System.out.println(students[x].toString());
                        }
                    }
                    break;
                case 7:
                    endTask = true;
                    System.out.print("Exiting");
                    break;
            }
        }while(endTask == false);
    }
}
