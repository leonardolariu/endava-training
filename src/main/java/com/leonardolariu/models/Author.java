package com.leonardolariu.models;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Author {
    @Setter(AccessLevel.NONE)
    UUID id;
    String name;
    Integer age;

    public Author() {
        this.id = UUID.randomUUID();
    }
}
