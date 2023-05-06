package com.corejavaprojects.jdbc;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {

		IStudentDao dao = new StudentDaoImpl();
		showMenu(dao);

	}

	private static void showMenu(IStudentDao dao) {
		while (true) {
			System.out.println("\n================= WELCOME TO STUDENT MANAGEMENT ================= \n");
			System.out.println("1. Register a new Student.");
			System.out.println("2. Update any existing Student's detail.");
			System.out.println("3. Search any Student by Registration number.");
			System.out.println("4. View All Students details");
			System.out.println("5. Delete any student by Registration number..");
			System.out.println("6. To Exit, Enter value 0");

			System.out.println("\nEnter your choice::");
			int choice = Utillity.getNumber();
			Utillity.getLine();

			switch (choice) {
			case 1:
				System.out.println("\n-------- ADDING NEW STUDENT ------");

				Student newStudent = new Student();

				System.out.println("Enter students Name :");
				newStudent.setName(Utillity.getLine());

				System.out.println("Enter Branch Name :");
				newStudent.setBranch(Utillity.getLine());

				System.out.println("Enter email ID :");
				newStudent.setEmail(Utillity.getLine());

				System.out.println("Enter contact number :");
				newStudent.setContact(Utillity.getLine());

				System.out.println(dao.insertStudent(newStudent));
				break;

			case 2:
				System.out.println("\n-------- UPDATING AN EXISTING STUDENT ------");

				Student updatedStudent = new Student();

				int updateRegistrationNumber;

				System.out.println("Enter students registration number to be updated :");
				updateRegistrationNumber = Utillity.getNumber();
				Utillity.getLine();

				System.out.println("Enter students Name :");
				updatedStudent.setName(Utillity.getLine());

				System.out.println("Enter Branch Name :");
				updatedStudent.setBranch(Utillity.getLine());

				System.out.println("Enter email ID :");
				updatedStudent.setEmail(Utillity.getLine());

				System.out.println("Enter contact number :");
				updatedStudent.setContact(Utillity.getLine());

				System.out.println(dao.updateStudent(updatedStudent, updateRegistrationNumber));
				break;

			case 3:
				System.out.println("\n-------- SEARCHING STUDENT BY REGISTRATION NUMBER ------");

				System.out.println("Enter student registration number to be searched :");
				int registrationNumber = Utillity.getNumber();
				Utillity.getLine();

				Student foundStudent = dao.getStudentByRegistrationNumber(registrationNumber);
				System.out.println("Student found ---->>> ");
				System.out.println("Reg No. : " + foundStudent.getReg());
				System.out.println("Name : " + foundStudent.getName());
				System.out.println("Branch : " + foundStudent.getBranch());
				System.out.println("Email : " + foundStudent.getEmail());
				System.out.println("Contact : " + foundStudent.getContact() + "\n");

				break;

			case 4:
				System.out.println("\n-------- FETCHING ALL STUDENT's DETAILS ------");
				List<Student> students = dao.getAllStudents();
				for (Student student : students) {
					System.out.println("Reg No. : " + student.getReg());
					System.out.println("Name : " + student.getName());
					System.out.println("Branch : " + student.getBranch());
					System.out.println("Email : " + student.getEmail());
					System.out.println("Contact : " + student.getContact() + "\n");
				}
				break;

			case 5:
				System.out.println("\n-------- DELETING A STUDENT FROM THE SYSTEM. ------");

				System.out.println("Enter student registration number to be deleted :");
				int registrationDelete = Utillity.getNumber();
				System.out.println(dao.deleteStudent(registrationDelete));

				break;

			case 0:
				System.out.println("\nExiting the application... Thank you for your time !!!");
				System.exit(0);
			default:
				System.out.println("\nIncorrect input!!! Please re-enter choice from our menu again !!!");

			}
		}
	}
}