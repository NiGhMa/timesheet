package lab.nighma.timesheet.service;

import antlr.ASTNULLType;
import lab.nighma.timesheet.dao.EmployeeRepository;
import lab.nighma.timesheet.dto.EmployeeDto;
import lab.nighma.timesheet.model.Employee;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	@Mock
	private EmployeeRepository employeeRepository;

	private EmployeeService employeeService;

	@BeforeEach
	void setUp() {
		employeeService = new EmployeeService(employeeRepository);
	}

	@Test
	void getEmployees_NoFilters_NoCount_ShouldReturnAllEmployees() {
		Employee mp = new Employee("Polo", "Marco", "+15551234567", "mp@mail.com", null);
		mp.setId(1L);
		Employee ldv = new Employee("Da Vinci", "Léonardo", "+15551230987", "ldv@mail.com", null);
		ldv.setId(2L);
		List<Employee> employeeListMock = List.of(mp, ldv);

		given(employeeRepository.findAll()).willReturn(employeeListMock);
		List<EmployeeDto> employees = employeeService.getEmployees(null, 0, 0, false);

		assertFalse(employees.isEmpty());
		assertThat((employees.size())).isEqualTo(2);
		assertEquals(mp, Employee.fromDto(employees.get(0)));
		assertEquals(ldv, Employee.fromDto(employees.get(1)));
	}
}
