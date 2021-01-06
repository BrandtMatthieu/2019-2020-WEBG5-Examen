package webg5.g44422.tasks.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/dashboard", produces = "text/html")
public class DashboardController {
	@GetMapping("/")
	public String dashboard() {
		return "dashboard";
	}
}
