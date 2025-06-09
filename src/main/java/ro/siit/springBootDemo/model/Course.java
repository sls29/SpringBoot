package ro.siit.springBootDemo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

/*    @OneToMany(mappedBy = "courses", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,  CascadeType.MERGE}, orphanRemoval = true)
    List<Student> students;
*/
}

