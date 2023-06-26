package citizen.example.test.service;

import citizen.example.test.config.MapperConfig;
import citizen.example.test.contract.Citizen;
import citizen.example.test.model.CitizenDetails;
import citizen.example.test.repository.CitizenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CitizenService {

    private final CitizenRepository citizenRepository;
    private final MapperConfig mapperConfig;
    public Long saveCitizen(Citizen request) {

        CitizenDetails citizenDetails = mapperConfig.setModelMapper().map(request, CitizenDetails.class);
        citizenRepository.save(citizenDetails);
        return citizenDetails.getId();
    }


}
