package edu.rcet.john.demo.variable;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int rollNo = 0;
		String fullName = "";
		char gender = ' ';
		float height = 0.0f;
		long phone = 0l;
		String email = "";
		String course = "";
		double cgpa = 0.0d;
		boolean feePaid = false;
		
		/*rollNo = 2001;
		fullName = "John Philip";
		gender = 'M';
		height = 5.6f;
		phone = 9898989898l;
		email = "john@gmail.com";
		course = "Master of Computer Applications";
		cgpa = 9.1d;
		feePaid = true;*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Roll Number:"); 
		rollNo = scan.nextInt(); scan.nextLine();
		System.out.println("Enter Name:"); 
		fullName = scan.nextLine();
		System.out.println("Enter Gender:"); 
		gender = scan.next().charAt(0); scan.nextLine();
		System.out.println("Enter Height:"); 
		height = scan.nextFloat();scan.nextLine();
		System.out.println("Enter Phone Number:"); 
		phone = scan.nextLong();scan.nextLine();
		System.out.println("Enter Email:"); 
		email = scan.nextLine();
		System.out.println("Enter Course:"); 
		course = scan.nextLine();
		System.out.println("Enter CGPA:"); 
		cgpa = scan.nextDouble();scan.nextLine();
		System.out.println("Enter Fee Paid:"); 
		feePaid = scan.nextBoolean();scan.nextLine();
		scan.close();
		
		System.out.println("Roll Number		:	" + rollNo);								
		System.out.println("Full Name		:	" + fullName);						
		System.out.println("Gender			:	" + gender);							
		System.out.println("Height			:	" + height);								
		System.out.println("Phone			:	" + phone);						
		System.out.println("Email			:	" + email);					
		System.out.println("Course			:	" + course);	
		System.out.println("CGPA			:	" + cgpa);								
		System.out.println("Fee Paid?		:	" + feePaid);								

	}

}
