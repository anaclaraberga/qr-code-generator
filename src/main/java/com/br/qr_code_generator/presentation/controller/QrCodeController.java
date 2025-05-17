package com.br.qr_code_generator.presentation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.qr_code_generator.presentation.dtos.QrCodeGeneratorRequest;
import com.br.qr_code_generator.presentation.dtos.QrCodeGeneratorResponse;
import com.br.qr_code_generator.presentation.services.QrCodeGeneratorService;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService service;

    public QrCodeController(QrCodeGeneratorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponse> generate(@RequestBody QrCodeGeneratorRequest request) {

        try {

            QrCodeGeneratorResponse response = this.service.generateAndUploadQrCode(request.text());

            return ResponseEntity.ok(response);

        } catch (Exception e) {
            
            System.out.println(e);
            return ResponseEntity.internalServerError().build();
            
        }
    }
    
}
