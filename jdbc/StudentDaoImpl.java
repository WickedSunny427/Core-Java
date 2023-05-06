package com.corejavaprojects.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements IStudentDao {

	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String DB_USERNAME = "system";
	static final String DB_PASSWORD = "tiger";

	@Override
	public String insertStudent(Student student) {

		String response = null;

		String sql = "INSERT INTO student (reg, name, branch , email , contact) values (STUDENT_SEQUENCE.NextVAL, ? , ? , ? , ?)";

		try (Connection conn = DbConnection.getConnection(); Statement stmt = conn.createStatement();) {

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setString(2, student.getBranch());
			statement.setString(3, student.getEmail());
			statement.setString(4, student.getContact());

			int row = statement.executeUpdate();

			if (row > 0)
				response = student.getName() + "'s details saved successfully in the system.";

		} catch (SQLException | IOException ex) {
			response = "Student not inserted !!!";
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public String updateStudent(Student student, int registrationNumber) {
		Connection conn = null;
		String response = null;
		try {
			conn = DbConnection.getConnection();
			String sql = "UPDATE STUDENT SET name=?, branch=?, email=? , contact=? WHERE reg=" + registrationNumber;

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setString(2, student.getBranch());
			statement.setString(3, student.getEmail());
			statement.setString(4, student.getContact());

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				response = "Student " + student.getName() + "'s details was updated successfully!";
			}

		} catch (Exception ex) {
			response = "Unable to update student !!!";
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public String deleteStudent(int registrationNumber) {
		String response = null;

		String sql = "DELETE FROM STUDENT WHERE reg=?";

		try (Connection conn = DbConnection.getConnection(); Statement stmt = conn.createStatement();) {

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, registrationNumber);
			int rowDeleted = statement.executeUpdate();

			if (rowDeleted > 0)
				response = "Student with registration number : " + registrationNumber + " was deleted successfully!";

		} catch (SQLException | IOException ex) {
			response = "Unable to delete student !!!";
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public List<Student> getAllStudents() {
		String QUERY = "SELECT * FROM STUDENT";

		List<Student> students = null;

		try (Connection conn = DbConnection.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery(QUERY);) {

			students = new ArrayList<>();

			while (result.next()) {
				Student student = new Student();
				student.setReg(result.getInt("reg"));
				student.setName(result.getString("name"));
				student.setBranch(result.getString("branch"));
				student.setEmail(result.getString("email"));
				student.setContact(result.getString("contact"));

				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return students;
	}

	@Override
	public Student getStudentByRegistrationNumber(int registrationNumber) {
		String QUERY = "SELECT * FROM STUDENT WHERE reg=" + registrationNumber;

		Student student = new Student();

		try (Connection conn = DbConnection.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet result = stmt.executeQuery(QUERY);) {

			while (result.next()) {
				student.setReg(result.getInt("reg"));
				student.setName(result.getString("name"));
				student.setBranch(result.getString("branch"));
				student.setEmail(result.getString("email"));
				student.setContact(result.getString("contact"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return student;
	}
}