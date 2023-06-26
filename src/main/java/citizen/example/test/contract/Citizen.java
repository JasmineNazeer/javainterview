package citizen.example.test.contract;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Citizen {

        private Long id;

        @NotEmpty
        private String name;

        @NotEmpty
        private String address;

        private String phone;

        @Past(message = "The date of birth must be in the past.")
        private LocalDate dateOfBirth;
}
