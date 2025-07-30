package com.example.qr.service;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class QRCodeService {
    public byte[] generateQRCode(String text, int size) {
        ByteArrayOutputStream stream = QRCode
                .from(text)
                .withSize(size, size)
                .to(ImageType.PNG)
                .stream();

        return stream.toByteArray();
    }
}
