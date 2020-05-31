package lab.nighma.timesheet.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public abstract class AbstractBaseEntity {

	@Id
	@GeneratedValue
	protected Long id;

}
