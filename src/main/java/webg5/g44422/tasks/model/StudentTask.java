package webg5.g44422.tasks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentTask {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int taskid;

	@ManyToOne
	@JoinColumn(name = "number")
	private Student student;

	@OneToOne(targetEntity = Task.class, mappedBy = "id")
	private Task task;

	private boolean done;
}
