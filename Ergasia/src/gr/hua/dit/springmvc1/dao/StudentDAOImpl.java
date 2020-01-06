package gr.hua.dit.springmvc1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.springmvc1.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Student> getStudents() {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Student> query = currentSession.createQuery("from Student", Student.class);

		// execute the query and get the results list
		List<Student> students = query.getResultList();

		// return the results
		return students;
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		if (student.getId() != 0) {
			// update the student
			currentSession.update(student);
		} else {
			// save the student
			currentSession.save(student);
		}

	}

	@Override
	@Transactional
	public Student getStudent(String email) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createQuery("from Student where email='"+email+"'", Student.class);
		// get and return Customer
		Student student = query.getSingleResult();
		return student;
	}

	@Override
	@Transactional
	public void deleteStudent(int id) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// find the Student
		Student Student = currentSession.get(Student.class, id);

		// delete Student
		currentSession.delete(Student);

	}
	
	@Override
	@Transactional
	public void updateStudent(Student student) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
			
			// update the student
			currentSession.update(student);
		}
	

	@Override
	@Transactional
	public Student enableStudent(Student student) {
		// get current hibernate session
		List<Student> tempstd = getStudents();
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createQuery("from Student where email='"+student.getEmail()+"'", Student.class);
	
		Student student1 = query.getSingleResult();
		return student1;
	}
}