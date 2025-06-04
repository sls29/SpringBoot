package ro.siit.springBootDemo.controller;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.siit.springBootDemo.model.Student;
import ro.siit.springBootDemo.model.dto.StudentDto;
import ro.siit.springBootDemo.repository.StudentRepository;
import ro.siit.springBootDemo.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    @Autowired
    private StudentService service;
    @Value("${helloMessage}")
    private String message;

    @GetMapping("/hi")
    public String sayHi() {
        return message;
    }

    @Tag(name = "Students API", description = "This method fetches all students from the database")
    @ApiResponses({
            @ApiResponse(responseCode = "200",
                    content = { @Content(examples = {},
                        schema = @Schema(implementation = Student.class),
                        mediaType = "application/json")
                    }
            ),
            @ApiResponse(responseCode = "404",
                    description = "The Tutorial with given Id was not found.",
                    content = { @Content(
                        schema = @Schema())
                    }
            )
    })
    @GetMapping("/students")
    public List<StudentDto> findAllStudents() {
        return service.findAllStudents();
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }
}
