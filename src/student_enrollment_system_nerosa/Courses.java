/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_enrollment_system_nerosa;

/**
 *
 * @author FernanCarl
 */
public class Courses {
    
    private int courseid;
    private String coursename;
    private String coursedes;
    private int credits;

    public Courses(int courseid, String coursename, String coursedes, int credits) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.coursedes = coursedes;
        this.credits = credits;
    }

    public Courses() {
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return coursename;
    }

    public void setCourseName(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseDescription() {
        return coursedes;
    }

    public void setCourseDescription(String coursedes) {
        this.coursedes = coursedes;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
    
}
