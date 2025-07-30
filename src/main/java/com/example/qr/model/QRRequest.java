package com.example.qr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class QRRequest {
    private String content;
    private int size;

    public String getContent() {
        return content;
    }

    public int getSize() {
        return size;
    }
}
