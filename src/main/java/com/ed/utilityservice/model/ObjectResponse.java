package com.ed.utilityservice.model;

import com.ed.utilityservice.exceptions.NotFoundException;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "status", "message", "data" })
public class ObjectResponse<T> {

    private String status;
    private String message;
    private T data;

    public ObjectResponse() {}

    public ObjectResponse(String status, String message, Optional<T> data, String entity) {
        this.status = status;
        this.message = message;
        this.data = data.orElseThrow(() -> new NotFoundException(entity));
    }

    public ObjectResponse(String status, String message, Optional<T> data) {
        this.status = status;
        this.message = message;
        this.data = data.orElseThrow(NotFoundException::new);
    }

    public ObjectResponse(String status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ObjectResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return String return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return T return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }
}
