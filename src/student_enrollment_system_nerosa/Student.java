/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_enrollment_system_nerosa;

/**
 *
 * @author Kane
 */
public class Student {
    
    private int studentid;
    private String fname;
    private String lname;
    private int age;
    private String email;

    public Student(int studentid, String fname, String lname, int age, String email) {
        this.studentid = studentid;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.email = email;
    }

    public Student() {
    }
    
    

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
