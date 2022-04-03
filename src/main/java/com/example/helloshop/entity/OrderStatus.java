package com.example.helloshop.entity;

public enum OrderStatus {
    ORDER(1L, "ORDER"),
    CANCEL(2L, "CANCEL");

    Long idx;
    String order;

    OrderStatus(Long idx, String order) {
        this.idx = idx;
        this.order = order;
    }
}
