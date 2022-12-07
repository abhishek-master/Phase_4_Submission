package Simplilearn_Project.LAcademy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class LAStudents { 
	@Id
	private int Student_id ;
	private String Student_name ;
	@OneToMany
	private LAClasses la ;
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	
	public LAClasses getLa() {
		return la;
	}
	public void setLa(LAClasses la) {
		this.la = la;
	}
	@Override
	public String toString() {
		return "LAStudents [Student_id=" + Student_id + ", Student_name=" + Student_name + "]";
	} 
	
	
	
	

}
