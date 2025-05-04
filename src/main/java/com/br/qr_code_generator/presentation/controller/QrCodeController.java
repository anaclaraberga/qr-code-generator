package com.br.qr_code_generator.presentation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.qr_code_generator.presentation.dtos.QrCodeGeneratorRequest;
import com.br.qr_code_generator.presentation.dtos.QrCodeGeneratorResponse;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponse> generate(@RequestBody QrCodeGeneratorRequest request) {
        return null;
    }
    
}
