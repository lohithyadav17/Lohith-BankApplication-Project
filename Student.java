package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int studentId;
    private int gradeYear;
	private String courses = "";
	private int tuitionBalance;
	private int costOffCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student firstName: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student lastName: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		 setStudentID();
	}
			
		// Genrate ID
		 
		 private void setStudentID() {
			 id++;
			 this.studentId = gradeYear +   + id;
		 }
		
		// Enroll to courses
		public void enroll() {
		do {
			System.out.println("Enter the course to Enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses += (courses.isEmpty() ? "" : "\n") + course;  // Append new course
                tuitionBalance += costOffCourse;
			} else 
			{
				break;
			}
		}while(1 != 0);
		}
		
		
		// view balance
		
		public void viewBalance() {
			System.out.print("Your balance is: $" + tuitionBalance) ;
		}
		
		// pay tuition
		public void payTution() {
			viewBalance();
			System.out.println(" Enter your payment: $");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.println("Thank you for your payment of $ " + payment);
			viewBalance();
		}
		
		public String toString() {
		return " Name: " + firstName + " " + lastName + 
				"\nGrade Level: " +
		       "\nCourses Enrolled: " + courses + 
		       "\nBalance: $" + tuitionBalance; 
	} 

}
