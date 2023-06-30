package ro.siit.springBootDemo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ro.siit.springBootDemo.model.dto.StudentDto;
import ro.siit.springBootDemo.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    @Value("${maxResults}")
    private long maxResults;

    private final StudentRepository studentRepository;
    public List<StudentDto> findAllStudents() {
        return studentRepository
                .findAll()
                .stream()
                .limit(maxResults)
                .map(StudentDto::toDto)
                .toList();

    }

}

