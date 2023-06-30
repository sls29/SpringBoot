package ro.siit.springBootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.siit.springBootDemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
