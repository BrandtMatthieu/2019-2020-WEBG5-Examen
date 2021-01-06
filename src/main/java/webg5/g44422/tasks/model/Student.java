package webg5.g44422.tasks.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private long number;

	private String name;
	
	@OneToMany(targetEntity = StudentTask.class, mappedBy = "student")
	private Collection<StudentTask> tasks;
}
