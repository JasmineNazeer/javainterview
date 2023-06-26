package citizen.example.test.controller;

import citizen.example.test.contract.Citizen;
import citizen.example.test.service.CitizenService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("citizens")
@RequiredArgsConstructor
public class CitizenController {

    private final CitizenService citizenService;

 @PostMapping(value = "/create")
 public void createCitizen (@RequestBody @Valid Citizen request){
     citizenService.saveCitizen(request);

 }

}
