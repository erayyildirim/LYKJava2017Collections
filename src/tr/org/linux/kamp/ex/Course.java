package tr.org.linux.kamp.ex;

import java.util.ArrayList;

public class Course {
	private String name;
	private Department department;
	private String lecturerName;
	private ArrayList <Students> registeredStudents=new ArrayList<>();
	
	public Course(String name, Department department, String lecturerName) {
		super();
		this.name = name;
		this.department = department;
		this.lecturerName = lecturerName;
	}


	public void registerToCourse(Students s1){
		registeredStudents.add(s1);
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public ArrayList<Students> getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(ArrayList<Students> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", department=" + department
				+ ", lecturerName=" + lecturerName + ", registeredStudents="
				+ registeredStudents + "]"+"\n\n";
	}
	
	
	
	
	
	

}
