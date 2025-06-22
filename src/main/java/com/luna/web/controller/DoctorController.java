package com.luna.web.controller;

import com.luna.application.service.DoctorService;
import com.luna.web.dto.DoctorRequestDto;
import com.luna.web.dto.DoctorResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctores")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping("/{id}")
    public ResponseEntity<DoctorResponseDto> getById(@PathVariable Long id,
                                                     @AuthenticationPrincipal Jwt jwt){
        String clientId = jwt.getClaimAsString("clientId");
        return ResponseEntity.ok(doctorService.getById(id));
    }
}
