package com.ed.utilityservice.model;

import com.ed.utilityservice.enumerations.PatchOperation;

public class PatchModel {

    private PatchOperation op;

    private String key;

    private Object value;

    public PatchOperation getOp() {
        return op;
    }

    public void setOp(PatchOperation op) {
        this.op = op;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PatchModel [op=" + op + ", key=" + key + ", value=" + value + "]";
    }
}
