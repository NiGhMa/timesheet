package lab.nighma.timesheet.controller;

import lab.nighma.timesheet.dto.EmployeeListDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	private EmployeeListDto all() {
		return new EmployeeListDto();
	}
}
