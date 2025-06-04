package ro.siit.springBootDemo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Entity
@Table(name = "students")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "students_courses",
//            joinColumns = {@JoinColumn(name = "student_id")},
//            inverseJoinColumns = {@JoinColumn(name = "course_id")}
//    )
//    @Fetch(FetchMode.JOIN)
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    private List<Course> courses;


    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


}
