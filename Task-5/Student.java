package Codsoft;

import java.util.ArrayList;

public class Student {
	private String id;
	private String name;
	private ArrayList<Course> list;
	public Student(String id, String name) {
		this.id=id;
		this.name=name;
		this.list=new ArrayList<>();
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Course> getList(){
		return list;
	}
	public void registerCourse(Course course) {
		if(course.isAvailable()&& !list.contains(course)) {
			course.registration();
			list.add(course);
			System.out.println("Successfully registered "+course.getTitle());
		}
		else {
			System.out.println("Unable to register the course");
		}
	}
	public void dropStudent(Course course) {
		if(list.contains(course)) {
			list.remove(course);
			course.drop();
			System.out.println("Successfully dropped "+course.getTitle());
		}else {
			System.out.println("Unable to drop the course");
		}
	}
	public void display() {
		for(Course course:list) {
			System.out.println(course);
		}
	}
}

