package com.nf147.entity;

public class Apiresponse {
    private Integer a_code;

    private String a_type;

    private String a_message;

    public Integer getA_code() {
        return a_code;
    }

    public void setA_code(Integer a_code) {
        this.a_code = a_code;
    }

    public String getA_type() {
        return a_type;
    }

    public void setA_type(String a_type) {
        this.a_type = a_type == null ? null : a_type.trim();
    }

    public String getA_message() {
        return a_message;
    }

    public void setA_message(String a_message) {
        this.a_message = a_message == null ? null : a_message.trim();
    }
}