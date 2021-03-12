package com.leonardolariu.models;

public enum Tag {

    AD ("Algorithm design"),
    DS ("Data structures"),
    OOM ("Object-oriented modeling"),
    NETWORKING ("Networking"),
    WT ("Web technologies");

    private final String value;

    Tag(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
