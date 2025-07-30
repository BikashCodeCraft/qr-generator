package com.example.qr.controller;

import com.example.qr.model.QRRequest;
import com.example.qr.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/qr")
public class QRController {

    @Autowired
    private QRCodeService qrService;

    @PostMapping("/generate")
    public ResponseEntity<byte[]> generateQR(@RequestBody QRRequest request) {
        byte[] image = qrService.generateQRCode(request.getContent(), request.getSize());

        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(image);
    }
}
