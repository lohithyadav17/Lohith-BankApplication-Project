package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numofStudents = in.nextInt();
		Student[]  students = new Student[numofStudents];
		
		for(int n = 0; n< numofStudents;n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
			
		}
		
		for(int n = 0 ; n < numofStudents; n ++) {
			System.out.println(students[n].toString());
		}
		
		
	}
	
	
	

}
