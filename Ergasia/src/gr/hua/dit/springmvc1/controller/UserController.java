package gr.hua.dit.springmvc1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.xml.fastinfoset.Encoder;

import gr.hua.dit.springmvc1.dao.UserDAO;

import gr.hua.dit.springmvc1.entity.User;

@Controller
@RequestMapping("/user")

public class UserController {

	// inject the student dao
	@Autowired
	private UserDAO userDAO;

	@GetMapping("/list")
	public String listUsers(Model model) {
		// get Students from dao
		List<User> users = userDAO.getUsers();

		// add the customers to the model
		model.addAttribute("users", users);

		return "list-users";
	}
	
	@GetMapping("/{id}")
	public String getUser(Model model, @PathVariable("id") int id) {
		// get the Student
		User user = userDAO.getUser(id);
		
		model.addAttribute("user", user);
		
		return "user-form";
	}
	
	@GetMapping("/addUser")
	public String showAddForm(HttpServletRequest request,Model model) {
		// create model attribute to get form data
		User user = new User();
		
		
		
			model.addAttribute("user", user);
		
		
		// add page title
		model.addAttribute("pageTitle", "Add a User");
		return "user-form";
		
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user) {
		// save the student using the service
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		user.setAuthority(user.getAuthority());	
		userDAO.saveUser(user);
		
		
		return "redirect:/user/list";
	}

}
