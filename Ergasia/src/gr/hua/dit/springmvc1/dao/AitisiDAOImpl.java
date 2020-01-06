package gr.hua.dit.springmvc1.dao;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;


import gr.hua.dit.springmvc1.entity.Aitisi;

@Repository
public class AitisiDAOImpl implements AitisiDAO {

	@Autowired
	private SessionFactory sessionFactory;

		
	@Override
	@Transactional
	public List<Aitisi> getAitisis() {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Aitisi> query = currentSession.createQuery("from Aitisi", Aitisi.class);

		// execute the query and get the results list
		List<Aitisi> aitisis = query.getResultList();

		// return the results
		return aitisis;
	}

	@Override
	@Transactional
	public List<Aitisi> getAitisisDESC() {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Aitisi> query = currentSession.createQuery("from Aitisi ORDER BY moria DESC", Aitisi.class);

		// execute the query and get the results list
		List<Aitisi> aitisisdesc = query.getResultList();

		// return the results
		return aitisisdesc;
	}

	@Override
	@Transactional
	public void saveAitisi(Aitisi aitisi) {

		Session currentSession = sessionFactory.getCurrentSession();

		// save the aitisi
		currentSession.save(aitisi);
		
	}
	
	

	@Override
	@Transactional
	public Aitisi getAitisi(HttpServletRequest request, Aitisi aitisi) {
		// get current hibernate session

		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Aitisi> query = currentSession.createQuery("from Aitisi where student_email='" + request.getUserPrincipal().getName() + "'",Aitisi.class);

		// execute the query and get the results list
		Aitisi aitisi1 = query.getSingleResult();
	
		// return the results
		return aitisi1;
	}

	@Override
	@Transactional
	public void deleteAitisi(String student_email) {
		// TODO Auto-generated method stub

	}

}
