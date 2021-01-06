package webg5.g44422.tasks.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import webg5.g44422.tasks.services.StudentsService;
import webg5.g44422.tasks.services.TasksService;

@Controller
@RequestMapping(path = "/dashboard", produces = "text/html")
public class DashboardController {

	@Autowired
	private StudentsService studentsService;

	@Autowired
	private TasksService tasksService;

	@GetMapping("/")
	public String dashboard(Model model) {
		model.addAttribute("tasks", tasksService.getTasks());
		model.addAttribute("students", studentsService.getStudents());
		return "dashboard";
	}
}
