package citizen.example.test.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="citizen")
public class CitizenDetails {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name")
    @NotEmpty
    private String name;

    @Column(name="address")
    @NotEmpty
    private String address;

    @Column(name="phone")
    private String phone;

    @Column(name="dateOfBirth")

    private LocalDate dateOfBirth;
}
