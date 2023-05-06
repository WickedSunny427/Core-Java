package com.corejavaprojects.jdbc;

import java.util.List;

public interface IStudentDao {

	public String insertStudent(Student student);

	public String updateStudent(Student student, int registrationNumber);

	public String deleteStudent(int registrationNumber);

	public List<Student> getAllStudents();

	public Student getStudentByRegistrationNumber(int registrationNumber);
}