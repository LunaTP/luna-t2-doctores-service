package com.luna.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "doctores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String especialidad;

    @Enumerated(EnumType.STRING)
    private EstadoDoctor estado;

}
