package webg5.g44422.tasks.api;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webg5.g44422.tasks.model.Student;
import webg5.g44422.tasks.services.StudentsService;

@RestController
@RequestMapping(path = "/api", produces="application/json")
public class StudentsREST {
	
	@Autowired
	private StudentsService studentsService;

	@GetMapping("/students_done")
	public Collection<Student> studentsDone() {
		return studentsService.getStudentsDone();
	}

}
