package gr.hua.dit.springmvc1.controller;

import java.security.Principal;
import java.security.Security;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import gr.hua.dit.springmvc1.dao.AitisiDAO;

import gr.hua.dit.springmvc1.entity.Aitisi;
import gr.hua.dit.springmvc1.entity.Student;

@Controller
@RequestMapping("/aitisi")
public class AitisiController {
	// inject the aitisi dao
	@Autowired
	private AitisiDAO aitisiDAO;
	private Authentication authentication;

	@GetMapping("/list")
	public String getAitisis(Model model) {
		// get aitisis from dao
		List<Aitisi> aitisis = aitisiDAO.getAitisis();

		// add the aitisis to the model
		model.addAttribute("aitisis", aitisis);

		return "list-aitisis";
	}

	@GetMapping("/listdesc")
	public String getAitisisdesc(Model model) {
		// get Students from dao
		List<Aitisi> aitisis = aitisiDAO.getAitisisDESC();

		// add the customers to the model
		model.addAttribute("aitisis", aitisis);

		return "list-aitisis";
	}

	@GetMapping("/addAitisi")
	public String showAddForm(HttpServletRequest request, Model model) {
		// create model attribute to get form data
		try {

			Aitisi aitisi = new Aitisi();
//			Student student =new Student();
//			student.setEmail(email);
			
			
			aitisi.setStudent_email(request.getUserPrincipal().getName().toString());
			

			model.addAttribute("aitisi", aitisi);

			// add page title
			model.addAttribute("pageTitle", "Αίτηση στέγασης");
		} catch (Exception e) {

		}
		return "aitisi-form";

	}

	@PostMapping("/saveAitisi")
	public String saveAitisi(@ModelAttribute("aitisi") Aitisi aitisi) {
		// save the student using the service
		try {
			
			//aitisi.setStudent_email(aitisi.getStudent_email());
			System.out.println(aitisi.getStudent_email());
			aitisi.setMoria();
			aitisi.getKatastasi();
			
			aitisiDAO.saveAitisi(aitisi);
		} catch (Exception e) {
			System.out.println("Το email υπάρχει");
		}

		return "redirect:/aitisi/getAitisi";
	}

	@GetMapping("/getAitisi")
	public String getAitisi(HttpServletRequest request, Model model) {
		boolean empty = true;
		try {

			Aitisi aitisi1 = new Aitisi();
			Aitisi aitisi = aitisiDAO.getAitisi(request, aitisi1);

			
					model.addAttribute("aitisi1", aitisi);
					
					empty = false;
				}

		catch (Exception e) {

		}
		if (empty == true) {

			return "error";
		} else {
			return "list-aitisi";
		}

	}
	
	
	
	

}
