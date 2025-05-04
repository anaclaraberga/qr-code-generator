package com.br.qr_code_generator.infrastructure.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String fileName, String contentType);
}