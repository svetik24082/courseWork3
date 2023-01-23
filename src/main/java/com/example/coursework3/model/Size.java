package com.example.coursework3.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Size {
    XS(32),
    S(35),
    M(38),
    L(42),
    XL(46);

    private final int maxSize;

    Size(int maxSize) {
        this.maxSize = maxSize;
    }

    @JsonCreator
    public static Size convertSize(int value) {
        for (Size size : Size.values()) {
            if (value == size.maxSize) {
                return size;
            }

        }
        throw new RuntimeException(" Такого размера нет");
    }

}
