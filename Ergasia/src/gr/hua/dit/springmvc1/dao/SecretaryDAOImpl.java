package gr.hua.dit.springmvc1.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.springmvc1.entity.Secretary;
import gr.hua.dit.springmvc1.entity.Student;


@Repository
public class SecretaryDAOImpl implements SecretaryDAO {

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Secretary> getSecretaries() {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Secretary> query = currentSession.createQuery("from Secretary", Secretary.class);

		// execute the query and get the results list
		List<Secretary> Secretaries = query.getResultList();

		// return the results
		return Secretaries;
	}

	@Override
	@Transactional
	public void saveSecretary(Secretary secretary) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		if (secretary.getId() != 0) {
			// update the student
			currentSession.update(secretary);
		} else {
			// save the student
			currentSession.save(secretary);
		}

	}

	@Override
	@Transactional
	public Secretary getSecretary(String email) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Secretary> query = currentSession.createQuery("from Secretary where email='"+email+"'", Secretary.class);
		// get and return Secretary
		Secretary secretary = query.getSingleResult();
		return secretary;
	}

	@Override
	@Transactional
	public void deleteSecretary(int id) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// find the Secretary
		Secretary secretary = currentSession.get(Secretary.class, id);

		// delete Student
		currentSession.delete(secretary);

	}
	
	@Override
	@Transactional
	public void updateSecretary(Secretary secretary) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
			
			// update the student
			currentSession.update(secretary);
		}
		
	@Override
	@Transactional
	public List<Student> getDepStudents(String email) {
		// get current hibernate session
		Session currentSession1 = sessionFactory.getCurrentSession();
		Session currentSession2 = sessionFactory.getCurrentSession();

		// create a query 1
		Query<Secretary> query1 = currentSession1.createQuery("from Secretary where email='"+email+"'", Secretary.class);
		List<Secretary> sec = query1.getResultList();
		
		// create a query 2
		Query<Student> query2 = currentSession2.createQuery("from Student where department="+sec.get(0).getDepartment(), Student.class);
		List<Student> depstudents = query2.getResultList();
		
		// return the results
		return depstudents;
	}
	
	
}