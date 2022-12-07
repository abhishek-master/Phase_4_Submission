package Simplilearn_Project.LAcademy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LASubject {
	@Id
	private int S_id ;
	private String S_name ;
	
	@ManyToOne
	private LAClasses lacc ;
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	
	public LAClasses getLacc() {
		return lacc;
	}
	public void setLacc(LAClasses lacc) {
		this.lacc = lacc;
	}
	@Override
	public String toString() {
		return "LASubject [S_id=" + S_id + ", S_name=" + S_name + "]";
	} 
	
	
	
	

}
