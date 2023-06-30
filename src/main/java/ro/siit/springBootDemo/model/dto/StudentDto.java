package ro.siit.springBootDemo.model.dto;

import lombok.Data;
import ro.siit.springBootDemo.model.Student;

@Data
public class StudentDto {

    private String name;

    public static StudentDto toDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setName(student.getName());
        return studentDto;
    }

}
