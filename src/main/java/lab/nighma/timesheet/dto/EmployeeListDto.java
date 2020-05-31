package lab.nighma.timesheet.dto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDto {
	private final List<EmployeeDto> employees;

	public EmployeeListDto() {
		this.employees = new ArrayList<>();
	}

	public EmployeeListDto(List<EmployeeDto> employees) {
		this.employees = employees;
	}

	public List<EmployeeDto> getEmployees() {
		return employees;
	}
}
