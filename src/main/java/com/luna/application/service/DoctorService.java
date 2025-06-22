package com.luna.application.service;

import com.luna.web.dto.DoctorRequestDto;
import com.luna.web.dto.DoctorResponseDto;

public interface DoctorService {
    DoctorResponseDto getById(Long id);
}
