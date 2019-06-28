package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private  String studentID;
	private String courses=null;
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//constructor .. prompts for name and year
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName=in.nextLine();
		System.out.println("Enter student's last name: ");
		this.lastName=in.nextLine();
		System.out.println("1.Freshmen\n2.for Sophomore\n3.Junior\n4.Senior\nEnter student's class level: ");
		this.gradeYear=in.nextInt();
		setStudentID();
		
	}
	
	//generate 5 digit id
	private void setStudentID()
	{//grade level plus static id
		id++;
		this.studentID= gradeYear+""+id;
	}
	//enroll in courses
	public void enroll()
	{
		do {
		System.out.print("Enter course to enroll(Q to quit): ");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q"))
		{
			courses=courses+"\n"+course;
			tuitionBalance=tuitionBalance+costOfCourse;
		}else 
			break;
		}while(1);
	}
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: "+tuitionBalance);
	}
	//pay tuition
	public void payTuition()
	{
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in=new Scanner(System.in);
		int payment=in.nextIne();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	//show status
	public String showInfo()//can also name it toString() ie override the one in object class
	{
		return "Name: "+firstName+" "+lastName+
				"\nGrade Level: "+gradeYear+
				"\nStudent ID: "+studentID+
				"\nCourses Enrolled: " + courses+
				"\nBalance "+tuitionBalance;
	}

}
