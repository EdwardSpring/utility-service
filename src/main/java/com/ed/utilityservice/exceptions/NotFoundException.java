package com.ed.utilityservice.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super("Entity not found");
    }

    public NotFoundException(String entity) {
        super(String.format("%s not found", entity));
    }
}
