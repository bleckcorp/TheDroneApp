package com.bctech.thedroneapp.service.implementation;

import com.bctech.thedroneapp.dto.request.DroneRequestDto;
import com.bctech.thedroneapp.dto.request.MedicationRequestDto;
import com.bctech.thedroneapp.dto.response.DroneResponseDto;
import com.bctech.thedroneapp.dto.response.MedicationResponseDto;
import com.bctech.thedroneapp.service.DroneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DroneServiceImpl implements DroneService {
    @Override
    public DroneResponseDto registerDrone(DroneRequestDto droneRequestDto) {
        return null;
    }

    @Override
    public DroneResponseDto loadDrone(Long droneId, List<MedicationRequestDto> medicationRequestDtoList) {
        return null;
    }

    @Override
    public List<MedicationResponseDto> checkLoadedMedication(String droneSerialNumber) {
        return null;
    }

    @Override
    public List<DroneResponseDto> checkAvailableDrones() {
        return null;
    }

    @Override
    public String checkDroneBatteryLevel(String droneSerialNumber) {
        return null;
    }
}
