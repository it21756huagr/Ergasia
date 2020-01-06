package gr.hua.dit.springmvc1.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import gr.hua.dit.springmvc1.entity.Secretary;
import gr.hua.dit.springmvc1.entity.Student;


public interface SecretaryDAO {

	public List<Secretary> getSecretaries();
	
	public void saveSecretary(Secretary secretary);
	
	public Secretary getSecretary(String email);

	public void deleteSecretary(int id);
	
	public void updateSecretary(Secretary secretary);

	List<Student> getDepStudents(String email);

	
	
}
