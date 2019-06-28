package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ask how many students to add in database
		System.out.println("Enter number of new students to enroll");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Student[] students=new Student[n];
		//create n number of new students
		for(int i=0;i<n;i++)
		{
			students[i]=new Student();
			students[i].enroll();
			students[i].payTuition();

		}
		for(int i=0;i<n;i++)
		{
			
			System.out.println(students[i].showInfo());

		}
		

		
	}

}
