package Simplilearn_Project.LAcademy;

import javax.persistence.Entity;
import java.util.ArrayList ;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LAClasses { 
	@Id
	private int C_id ;
	private char ch ;
	
	@ManyToOne
	private LATeachers lat ;
	
	@OneToMany(mappedBy = "lacc") 
	private List<LASubject> las  = new ArrayList<LASubject> ( ) ;
	
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	} 
	public LATeachers getLat() {
		return lat;
	}
	public void setLat(LATeachers lat) {
		this.lat = lat;
	}
	public List<LASubject> getLas() {
		return las;
	}
	public void setLas(List<LASubject> las) {
		this.las = las;
	}
	@Override
	public String toString() {
		return "LAClasses [C_id=" + C_id + ", ch=" + ch + "]";
	}

}
