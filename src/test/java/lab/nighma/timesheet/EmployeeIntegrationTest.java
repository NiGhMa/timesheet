package lab.nighma.timesheet;

import lab.nighma.timesheet.dto.EmployeeListDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static lab.nighma.timesheet.TimeSheetRoutes.EMPLOYEES;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class EmployeeIntegrationTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void shouldReturnAllEmployees() {
		ResponseEntity<EmployeeListDto> response = restTemplate.getForEntity(EMPLOYEES, EmployeeListDto.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertNotNull(response.getBody());
		assertFalse(response.getBody().getEmployees().isEmpty());

	}
}
