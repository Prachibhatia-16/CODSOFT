package Codsoft;
import java.util.*;
public class Student_grade_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of subjects:");
		int n=s.nextInt();
		int arr[]=new int[n];
		int total_marks=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter marks for subject"+(i+1)+": ");
			arr[i]=s.nextInt();
			total_marks+=arr[i];
		}
		double avgPercentage=(double)total_marks/n;
		char grade;
		if(avgPercentage>=90) {
			grade='A';
		}else if(avgPercentage>=80) {
			grade='B';
		}else if(avgPercentage>=70) {
			grade='C';
		}else if(avgPercentage>=60) {
			grade='D';
		}else {
			grade='F';
		}
		System.out.println("Your total marks are: "+total_marks);
		System.out.println("Your average percentage is: "+avgPercentage);
		System.out.println("Your grade is: "+grade);
		}
	}


