package gr.hua.dit.springmvc1.dao;

import java.util.List;

import gr.hua.dit.springmvc1.entity.User;

public interface UserDAO {

	public List<User> getUsers();
	
	public void saveUser(User user);
	
	public User getUser(int id);

	public void deleteUser(String username);
}
