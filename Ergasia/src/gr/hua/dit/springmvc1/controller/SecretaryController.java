package gr.hua.dit.springmvc1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gr.hua.dit.springmvc1.dao.SecretaryDAO;
import gr.hua.dit.springmvc1.dao.StudentDAO;
import gr.hua.dit.springmvc1.entity.Secretary;
import gr.hua.dit.springmvc1.entity.Student;


@Controller
@RequestMapping("/secretary")

public class SecretaryController {

	// inject the student dao
	@Autowired
	private SecretaryDAO secretaryDAO;

	@GetMapping("/list")
	public String listSecretaries(Model model) {
		// get Students from dao
		List<Secretary> secretaries = secretaryDAO.getSecretaries();
		
		// add the customers to the model
		model.addAttribute("secretaries", secretaries);


		return "list-secretaries";
	}
	
	@GetMapping("/getSecretaries")
	public String getStudent(Model model, @PathVariable("email") String email) {
		// get the Student
		Secretary secretary = secretaryDAO.getSecretary(email);
		
		model.addAttribute("secretary", secretary);
		
		return "secretary-form";
	}
	
	@GetMapping("/addSecretary")
	public String showAddForm(HttpServletRequest request,Model model) {
		// create model attribute to get form data
		Secretary secretary = new Secretary();

			model.addAttribute("secretary", secretary);
		
		
		// add page title
		model.addAttribute("pageTitle", "Add a Secretary");
		return "secretary-form";
		
	}
	@GetMapping("/departmentStudents")
	public String listdepStudents(HttpServletRequest request,Model model) {
		// get Students from dao
		
		List<Student> students = secretaryDAO.getDepStudents(request.getUserPrincipal().getName());
		
		// add the customers to the model
		model.addAttribute("students", students);


		return "list-departmentstudents";
	}
	
	@PostMapping("/saveSecretary")
	public String saveSecretary(@ModelAttribute("secretary") Secretary secretary) {
		// save the student using the service
		
		secretaryDAO.saveSecretary(secretary);
		
		
		return "redirect:/secretary/list";
	}

	
	@PostMapping("/updateSecretary")
	public String updateSecretary(@ModelAttribute("secretary") Secretary secretary) {
		// save the student using the service
		boolean done =false;
		try {
			
			secretaryDAO.updateSecretary(secretary);
			done=true;
		}catch (Exception e) {

		}
		if (done == false) {

			return "error";
		} else {
			return "redirect:/secretary/list";
		}
		
		
		
		
	}

	

	
}
