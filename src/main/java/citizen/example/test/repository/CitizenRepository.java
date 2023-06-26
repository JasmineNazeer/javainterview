package citizen.example.test.repository;

import citizen.example.test.contract.Citizen;
import citizen.example.test.model.CitizenDetails;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CitizenRepository extends JpaRepository<CitizenDetails, Id> {

}
