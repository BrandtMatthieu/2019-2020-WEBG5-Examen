package webg5.g44422.tasks.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/student/", produces = "text/html")
public class StudentController {
	
	@RequestMapping("/{id}/")
	public String student() {
		return "student";
	}

}
