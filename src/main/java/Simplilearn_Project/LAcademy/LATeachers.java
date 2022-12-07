package Simplilearn_Project.LAcademy;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity  
public class LATeachers { 
	
	@Id
	private int T_id ;
	private String T_name ; 
	
	@OneToMany(mappedBy = "lat")
	private List<LAClasses> lac = new ArrayList<LAClasses> () ;
	
	public int getT_id() {
		return T_id;
	}
	public void setT_id(int t_id) {
		T_id = t_id;
	}
	public String getT_name() {
		return T_name;
	}
	@Override
	public String toString() {
		return "LATeachers [T_id=" + T_id + ", T_name=" + T_name + "]";
	}
	
	public List<LAClasses> getLac() {
		return lac;
	}
	public void setLac(List<LAClasses> lac) {
		this.lac = lac;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	} 
	
	

}
