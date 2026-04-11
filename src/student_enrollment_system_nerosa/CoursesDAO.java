/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_enrollment_system_nerosa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FernanCarl
 */
public class CoursesDAO {
    
    public void addCourse(Courses course) {
    String sql = "INSERT INTO course (course_name, course_description, credits) VALUES (?, ?, ?)";
    try (Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, course.getCourseName());
        stmt.setString(2, course.getCourseDescription());
        stmt.setInt(3, course.getCredits());
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Course successfully added!");
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    public List<Courses> getAllCourses() {
    List<Courses> courses = new ArrayList<>();
    String sql = "SELECT * FROM course";
    try (Connection conn = DBConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            Courses course = new Courses();
            course.setCourseid(rs.getInt("course_id"));
            course.setCourseName(rs.getString("course_name"));
            course.setCourseDescription(rs.getString("course_description"));
            course.setCredits(rs.getInt("credits"));
            courses.add(course);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return courses;
}
    
    public void updateCourse(Courses course) {
        String sql = "UPDATE course SET course_name=?, course_description=?, credits=? WHERE course_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, course.getCourseName());
            stmt.setString(2, course.getCourseDescription());
            stmt.setInt(3, course.getCredits());
            stmt.setInt(4, course.getCourseid());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Course updated succesfully!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCourse(int courseid) {
        String sql = "DELETE FROM course WHERE course_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, courseid);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Course deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }      
    
}
