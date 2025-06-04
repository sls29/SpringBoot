package ro.siit.springBootDemo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Entity
@Table(name = "courses")
@Inheritance
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer duration;
////    @ManyToOne(fetch = FetchType.EAGER)
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    private List<Student> studentList;
}
