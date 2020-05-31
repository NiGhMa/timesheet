package lab.nighma.timesheet.model;

import lab.nighma.timesheet.dto.EmployeeDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Employee extends AbstractBaseEntity {

	private String lastName;
	private String firstName;
	private String phone;
	private String email;
	private String imageUrl;

	public Employee(String lastName, String firstName, String phone, String email, String photo) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
		this.imageUrl = photo;
	}

	public static Employee fromDto(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		employee.id =employeeDto.getId();
		employee.lastName =employeeDto.getLastName();
		employee.firstName = employeeDto.getFirstName();
		employee.phone = employeeDto.getPhone();
		employee.email = employeeDto.getEmail();
		employee.imageUrl = employeeDto.getPhoto();
		return employee;
	}
}
