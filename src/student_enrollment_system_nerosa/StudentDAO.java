/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_enrollment_system_nerosa;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author FernanCarl
 */
public class StudentDAO {
    
    public void addStudent(Student student) {
    String sql = "INSERT INTO students (first_name, last_name, age, email) VALUES (?, ?, ?, ?)";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, student.getFname());
        stmt.setString(2, student.getLname());
        stmt.setInt(3, student.getAge());
        stmt.setString(4, student.getEmail());
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Student successfully added!");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public List<Student> getAllStudents() {
    List<Student> students = new ArrayList<>();
    String sql = "SELECT * FROM students";
    try (Connection conn = DBConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            Student student = new Student();
            student.setStudentid(rs.getInt("student_id"));
            student.setFname(rs.getString("first_name"));
            student.setLname(rs.getString("last_name"));
            student.setAge(rs.getInt("age"));
            student.setEmail(rs.getString("email"));
            students.add(student);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return students;
}
    
    public void updateStudent(Student student) {
        String sql = "UPDATE students SET first_name=?, last_name=?, age=?, email=? WHERE student_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, student.getFname());
            stmt.setString(2, student.getLname());
            stmt.setInt(3, student.getAge());
            stmt.setString(4, student.getEmail());
            stmt.setInt(5, student.getStudentid());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteStudent(int studentId) {
        String sql = "DELETE FROM STUDENTS WHERE student_id=?;";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, studentId);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
