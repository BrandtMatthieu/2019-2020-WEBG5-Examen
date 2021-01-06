package webg5.g44422.tasks.services;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webg5.g44422.tasks.interfaces.StudentDB;
import webg5.g44422.tasks.model.Student;

@Service
public class StudentsService {
	
	@Autowired StudentDB studentDB;

	public Collection<Student> getStudents() {
		return StreamSupport.stream(studentDB.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public Collection<Student> getStudentsDone() {
		return StreamSupport.stream(studentDB.findAll().spliterator(), false).collect(Collectors.toList()); // TODO filter students done
	}

	public Student getStudentById(int id) {
		return StreamSupport.stream(studentDB.findAll().spliterator(), false).collect(Collectors.toList()).get(0); // TODO find student by id
	}

}
