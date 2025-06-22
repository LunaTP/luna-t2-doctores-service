package com.luna.application.mapper;

import com.luna.domain.model.Doctor;
import com.luna.domain.model.EstadoDoctor;
import com.luna.web.dto.DoctorRequestDto;
import com.luna.web.dto.DoctorResponseDto;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {

    public Doctor toEntity(DoctorRequestDto dto){
        Doctor doctor = new Doctor();
        doctor.setNombre(dto.getNombre());
        doctor.setEspecialidad(dto.getEspecialidad());
        doctor.setEstado(EstadoDoctor.valueOf(dto.getEstado()));
        return doctor;
    }

    public DoctorResponseDto toResponseDto(Doctor entity){
        return DoctorResponseDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .especialidad(entity.getEspecialidad())
                .estado(entity.getEstado().name())
                .build();
    }

}
