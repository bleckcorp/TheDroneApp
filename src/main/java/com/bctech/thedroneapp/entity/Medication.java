package com.bctech.thedroneapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "medication")
@Entity
public class Medication extends BaseEntity {
    private String name;
    private int weight;
    private String code;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "drone_id")
    private Drone drone;
}
