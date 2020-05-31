package lab.nighma.timesheet.controller;

import lab.nighma.timesheet.dto.EmployeeListDto;
import lab.nighma.timesheet.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static lab.nighma.timesheet.TimeSheetRoutes.EMPLOYEES;

@RestController
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(EMPLOYEES)
	private EmployeeListDto all() {
		return new EmployeeListDto(employeeService.getEmployees(null, 0, 0, false));
	}
}
