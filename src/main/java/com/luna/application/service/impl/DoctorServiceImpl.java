package com.luna.application.service.impl;

import com.luna.application.mapper.DoctorMapper;
import com.luna.application.service.DoctorService;
import com.luna.domain.model.Doctor;
import com.luna.domain.repository.DoctorRepository;
import com.luna.web.dto.DoctorRequestDto;
import com.luna.web.dto.DoctorResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository repository;
    private final DoctorMapper mapper;

    @Override
    public DoctorResponseDto getById(Long id) {
        Doctor doctor = repository.findById(id).orElseThrow(()->
                new RuntimeException("Doctor no encontrado"));
        return mapper.toResponseDto(doctor);
    }

}
