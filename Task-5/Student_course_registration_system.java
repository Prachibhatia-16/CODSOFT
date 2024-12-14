package Codsoft;
import java.util.*;

public class Student_course_registration_system {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<Course> courseList=new ArrayList<>();
		courseList.add(new Course("C101", "Java", "Intro to java DSA", 20, "MWF 10:00-11:00"));
		courseList.add(new Course("C102", "C++", "OOPS with c++", 25, "TTh 1:00-3:00"));
		courseList.add(new Course("C103", "Python", "Python", 30, "TTS 4:00-7:00"));
		ArrayList<Student> studentList=new ArrayList<>();
		studentList.add(new Student("S101", "Rohan"));
		studentList.add(new Student("S102", "Emily"));
		System.out.println("Welcome!");
		System.out.println("1. List all courses");
		System.out.println("2. Registration");
		System.out.println("3. Drop a course");
		System.out.println("4. Display students's registered courses");
		System.out.println("5. Exit");
		while(true) {
			
			System.out.println("Enter your choice:");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				for(Course x:courseList) {
					System.out.println(x);
				}
				break;
			case 2:
				System.out.println("Enter student id: ");
				String stuID=scanner.next();
				
				Student st=null;
				Course c=null;
				for(Student stu:studentList) {
					if(stu.getId().equals(stuID)) {
						st=stu;
						break;
					}
				}
				if(st==null) {
					System.out.println("Student not found");
					break;
				}
				System.out.println("Enter course id: ");
				String cID=scanner.next();
				for(Course co:courseList) {
					if(co.getCode().equals(cID)) {
						c=co;
						break;
					}
		
				}
				if(c==null) {
					System.out.println("Cose not found");
					break;
				}
				st.registerCourse(c);
				break;
			case 3:
				System.out.println("Enter StudentID: ");
				stuID=scanner.next();
				st=null;
				c=null;
				for(Student stu:studentList) {
					if(stu.getId().equals(stuID)) {
						st=stu;
						break;
					}
				}if(st==null) {
					System.out.println("Student not found");
					break;
				}
				System.out.println("Enter courseID: ");
				cID=scanner.next();
				for(Course co:courseList) {
					if(co.getCode().equals(cID)) {
						c=co;
						break;
					}
				}
				if(c==null) {
					System.out.println("Course not found");
					break;
				}
				else {
					st.dropStudent(c);
					break;
				}
				
			case 4:
				System.out.println("Enter studentID: ");
				stuID=scanner.next();
				st=null;
				for(Student stu:studentList) {
					if(stu.getId().equals(stuID)) {
						st=stu;
						break;
					}
				}
				if(st==null) {
					System.out.println("Student not found");
					break;
				}else {
					st.display();
					break;
				}
			case 5:
				System.out.println("RThankyou for visiting");
				return;
			default:
				System.out.println("Invalid choice");
				
			}
		}
	}

}
