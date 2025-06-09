package ro.siit.springBootDemo.model.dto;

import lombok.Data;
import ro.siit.springBootDemo.model.Student;

@Data
public class StudentDto {

    private String firstName;
    private String lastname;

    public static StudentDto toDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.firstName = student.getFirstName();
        studentDto.lastname = student.getLastName();
        return studentDto;
    }

}
