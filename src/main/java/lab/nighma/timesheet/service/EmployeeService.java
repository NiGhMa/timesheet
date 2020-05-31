package lab.nighma.timesheet.service;

import lab.nighma.timesheet.dao.EmployeeRepository;
import lab.nighma.timesheet.dto.EmployeeDto;
import lab.nighma.timesheet.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<EmployeeDto> getEmployees(String filters, int count, int offset, boolean embed) {
		List<Employee> employees = employeeRepository.findAll();
		return employees.stream().map(EmployeeDto::new).collect(Collectors.toList());
	}
}
