package webg5.g44422.tasks.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import webg5.g44422.tasks.model.Student;
import webg5.g44422.tasks.services.StudentsService;

@Controller
@RequestMapping(path = "/student/", produces = "text/html")
public class StudentController {

	@Autowired
	private StudentsService studentsService;

	
	@RequestMapping("/{number}/")
	public String student(
		Model model,
		@PathVariable("number") int number) {
			final Student student = studentsService.getStudentById(number);
			model.addAttribute("student", student);
		return "student";
	}

}
