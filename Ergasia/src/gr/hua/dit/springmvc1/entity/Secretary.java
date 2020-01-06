
package gr.hua.dit.springmvc1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import gr.hua.dit.springmvc1.entity.Student;

@Entity
@Table(name = "secretary")
public class Secretary  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
	
	@Column(name = "tel")
	private String tel;

	@Column(name = "department")
	private int department;
	
	@Column(name = "supervisor")
	private boolean supervisor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public boolean isSupervisor() {
		return supervisor;
	}

	
	public void setSupervisor(boolean supervisor) {
		this.supervisor = supervisor;
	}
	
//	 @OneToMany(mappedBy="department",
//             cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//                                    CascadeType.DETACH, CascadeType.REFRESH})
//	 @JoinColumn(name="department")
//	 private List<Student> students;
//
//	public List<Student> getStudents() {
//		return students;
//	}
//
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
	
}
