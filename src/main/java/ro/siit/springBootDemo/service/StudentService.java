package ro.siit.springBootDemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ro.siit.springBootDemo.model.Student;
import ro.siit.springBootDemo.model.dto.StudentDto;
import ro.siit.springBootDemo.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    @Value("${maxResults}")
    private long maxResults;

    @Autowired
    private StudentRepository studentRepository;

    public List<Student>getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll()
                .forEach(students::add);
        return students;
    }

    public List<StudentDto>findAllStudents() {
        return studentRepository
                .findAll()
                .stream()
                .limit(maxResults)
                .map(StudentDto::toDto)
                .toList();
    }

}

