/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_enrollment_system_nerosa;

import java.sql.Date;

/**
 *
 * @author FernanCarl
 */
public class Enrollment {
    
    private int enrollmentid;
    private int studentid;
    private int courseid;
    private Date enrollmentDate;

    public Enrollment(int enrollmentid, int studentid, int courseid, Date enrollmentDate) {
        this.enrollmentid = enrollmentid;
        this.studentid = studentid;
        this.courseid = courseid;
        this.enrollmentDate = enrollmentDate;
    }

    public Enrollment() {
    }

    public int getEnrollmentid() {
        return enrollmentid;
    }

    public void setEnrollmentid(int enrollmentid) {
        this.enrollmentid = enrollmentid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
    
    
    
}
