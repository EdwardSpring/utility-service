package com.ed.utilityservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import org.springframework.data.domain.Page;

@JsonPropertyOrder({ "status", "message", "currentSize", "totalSize", "currentPage", "totalPages", "data" })
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationResponse<T> {

    private String status;
    private String message;
    private int currentPage;
    private int totalPages;
    private int currentSize;
    private long totalSize;
    private List<T> data;

    public PaginationResponse() {}

    public PaginationResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public PaginationResponse(String status, String message, Page<T> page) {
        this.status = status;
        this.message = page.isEmpty() ? "No values found" : message;
        this.currentPage = page.getNumber();
        this.totalPages = page.getTotalPages();
        this.currentSize = page.getNumberOfElements();
        this.totalSize = page.getTotalElements();
        this.data = page.getContent();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }
}
