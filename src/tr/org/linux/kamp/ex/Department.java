package tr.org.linux.kamp.ex;

import java.util.HashMap;

public class Department {
	private String departmentName;
	private String facultyName;
	private HashMap<Integer, Students> students= new HashMap<>();
	
	
	
	public Department(String departmentName, String facultyName) {

		this.departmentName = departmentName;
		this.facultyName = facultyName;
		
	}
	
	public void addStudent(Students s1){
		students.put(s1.getId(),s1);
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public HashMap<Integer, Students> getStudents() {
		return students;
	}

	public void setStudents(HashMap<Integer, Students> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName
				+ ", facultyName=" + facultyName + ", students=" + students
				+ "]";
	}
	
	
	
	
	
	

}
