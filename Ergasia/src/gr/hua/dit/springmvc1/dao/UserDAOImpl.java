package gr.hua.dit.springmvc1.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import gr.hua.dit.springmvc1.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<User> getUsers() {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<User> query = currentSession.createQuery("from User", User.class);

		// execute the query and get the results list
		List<User> users = query.getResultList();

		// return the results
		return users;
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		{
			// save the user
			currentSession.save(user);
		}

	}

	

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(int id) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// get and return User
		User user = currentSession.get(User.class, id);
		return user;
	}


}
