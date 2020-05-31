package lab.nighma.timesheet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class EmployeeDto {
	private long id;
	private String lastName;
	private String firstName;
	private String phone;
	private String email;
	private String photo;

	public EmployeeDto(String lastName, String firstName, String phone, String email, String photo) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
		this.photo = photo;
	}
}
