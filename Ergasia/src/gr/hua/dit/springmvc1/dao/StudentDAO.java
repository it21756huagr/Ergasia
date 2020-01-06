package gr.hua.dit.springmvc1.dao;

import java.util.List;


import gr.hua.dit.springmvc1.entity.Student;

public interface StudentDAO {

	public List<Student> getStudents();
	
	public void saveStudent(Student student);
	
	public Student getStudent(String email);

	public void deleteStudent(int id);
	
	public void updateStudent(Student student);

	public Student enableStudent(Student student);

	
	
}
