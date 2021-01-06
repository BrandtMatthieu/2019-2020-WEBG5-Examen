package webg5.g44422.tasks.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import webg5.g44422.tasks.model.Student;

@Service
public interface StudentDB extends CrudRepository<Student, Double> {
}
