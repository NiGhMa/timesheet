package lab.nighma.timesheet.dto;

import lab.nighma.timesheet.model.Employee;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class EmployeeDto extends AbstractBaseDto{
	private String lastName;
	private String firstName;
	private String phone;
	private String email;
	private String photo;

	public EmployeeDto(Long id, String lastName, String firstName, String phone, String email, String photo) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
		this.photo = photo;
	}

	public EmployeeDto(Employee employee) {
		this.id = employee.getId();
		this.lastName = employee.getLastName();
		this.firstName = employee.getFirstName();
		this.phone = employee.getPhone();
		this.email = employee.getEmail();
		this.photo = employee.getImageUrl();
	}
}
