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

import gr.hua.dit.springmvc1.dao.StudentDAO;
import gr.hua.dit.springmvc1.entity.Secretary;
import gr.hua.dit.springmvc1.entity.Student;

@Controller
@RequestMapping("/student")

public class StudentController {

	// inject the student dao
	@Autowired
	private StudentDAO studentDAO;

	@GetMapping("/list")
	public String listStudents(Model model) {
		boolean done =false;
		try {
		// get Students from dao
		List<Student> students = studentDAO.getStudents();
				
		// add the customers to the model
		model.addAttribute("students", students);
		done=true;
		}catch (Exception e) {

			
			
			
			e.printStackTrace();
		}
		if (done == false) {

			return "error";
		} else {

		return "list-students";
		}
	}
	
	@GetMapping("/getStudent")
	public String getStudent(Model model, @PathVariable("email") String email) {
		// get the Student
		Student student = studentDAO.getStudent(email);
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@GetMapping("/addStudent")
	public String showAddForm(HttpServletRequest request,Model model) {
		// create model attribute to get form data
		Student student = new Student();

			model.addAttribute("student", student);
		
		
		// add page title
		model.addAttribute("pageTitle", "Add a Student");
		return "student-form";
		
	}
	@GetMapping("/addStudenttel")
	public String showTelForm(HttpServletRequest request,Model model) {
		// create model attribute to get form data
		Student student = studentDAO.getStudent(request.getUserPrincipal().getName());
		
		
		
			model.addAttribute("student", student);
		//student.setFirstName(student.getFirstName());
		
		// add page title
		model.addAttribute("pageTitle", "Update Your Telephone");
		return "studenttel-form";
		
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		// save the student using the service
		
			studentDAO.saveStudent(student);
		
		
		return "redirect:/student/list";
	}

	
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute("student1") Student student) {
		// save the student using the service
		boolean done =false;
		try {
			
			
			studentDAO.updateStudent(student);
			done=true;
		}catch (Exception e) {

			
			
			
			e.printStackTrace();
		}
		if (done == false) {

			return "error";
		} else {
			return "redirect:/student/list";
		}
		
		
		
		
	}

	@GetMapping("/enableStudent")
	public String enableStudent(Model model, String email) {
		// get the Student
		Student student = studentDAO.getStudent(email);
		
		model.addAttribute("student", student);
		
		return "enablestudent-form";
	
	}
}
