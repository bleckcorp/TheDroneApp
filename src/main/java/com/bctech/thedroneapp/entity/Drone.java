package com.bctech.thedroneapp.entity;

import com.bctech.thedroneapp.constants.enums.DroneModel;
import com.bctech.thedroneapp.constants.enums.DroneState;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "drone")
@Entity
public class Drone extends BaseEntity{
    @NotNull
    @Size(max = 100)
    private String serialNumber;

    @Enumerated(EnumType.STRING)
    private DroneModel model;

    @Max(500)
    private Integer weightLimit;

    private Integer batteryCapacity;

    @Enumerated(EnumType.STRING)
    private DroneState state;

    @OneToMany(mappedBy = "drone", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Medication> medications;

}
