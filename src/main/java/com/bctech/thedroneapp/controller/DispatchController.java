package com.bctech.thedroneapp.controller;

import com.bctech.thedroneapp.dto.response.AppResponse;
import com.bctech.thedroneapp.service.DroneService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.net.URI;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("dispatch")
public class DispatchController {
    private final DroneService droneService;
    private final MedicationService dispatchService;


    @PostMapping(path = "/new-drone")
    public ResponseEntity<AppResponse<?>> registerPatient(@RequestBody @Valid final PatientRegistrationRequestDto registrationRequestDto) throws IOException {
        log.info("controller register: register patient :: [{}] ::", registrationRequestDto.getEmail());
        PatientRegistrationResponse response = userService.registerPatient(registrationRequestDto);
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/v1/auth/register").toUriString());
        return ResponseEntity.created(uri).body(AppResponse.buildSuccess(response));
    }

}
