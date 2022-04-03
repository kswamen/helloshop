package com.example.helloshop.exception;

public class NotEnoughStockException extends RuntimeException {
    public NotEnoughStockException(String msg) {
        super(msg);
    }
}
