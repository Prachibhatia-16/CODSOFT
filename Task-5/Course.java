package Codsoft;
import java.util.*;
public class Course {
		private String code;
		private String title;
		private String desc;
		private int capacity;
		private int enrolled;
		private String schedule;
		public Course(String code, String title, String desc, int capacity, String sch) {
			this.code=code;
			this.title=title;
			this.desc=desc;
			this.capacity=capacity;
			this.schedule=sch;
			this.enrolled=0;
		}
		public String getCode() {
			return code;
		}
		public String getTitle() {
			return title;
		}
		public String getDesc() {
			return desc;
		}
		public int getCapacity() {
			return capacity;
		}
		public int getEnrolled() {
			return enrolled;
		}
		public String getSchedule() {
			return schedule;
		}
		public boolean isAvailable() {
			return enrolled<capacity;
		}
		public void registration() {
			if(isAvailable()) {
				enrolled++;
			}
		}
			public void drop(){
				if(enrolled>0) {
					enrolled--;
				}
			}
			@Override
			public String toString() {
				return "Course code: "+code+", Title: "+title+", Description"+desc+", Capacity: "+capacity+", Enrolled: "+enrolled+", Schedule: "+schedule;
			}
	}
	