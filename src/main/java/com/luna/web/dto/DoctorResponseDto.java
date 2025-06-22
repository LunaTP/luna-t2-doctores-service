package com.luna.web.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorResponseDto {
    private Long id;
    private String nombre;
    private String especialidad;
    private String estado;
}
