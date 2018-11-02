package com.nf147.entity;

public class User {
    private Integer u_id;

    private String u_Name;

    private String u_firstName;

    private String u_lastName;

    private String u_email;

    private String u_pwd;

    private String u_phone;

    private String u_Status;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_Name() {
        return u_Name;
    }

    public void setU_Name(String u_Name) {
        this.u_Name = u_Name == null ? null : u_Name.trim();
    }

    public String getU_firstName() {
        return u_firstName;
    }

    public void setU_firstName(String u_firstName) {
        this.u_firstName = u_firstName == null ? null : u_firstName.trim();
    }

    public String getU_lastName() {
        return u_lastName;
    }

    public void setU_lastName(String u_lastName) {
        this.u_lastName = u_lastName == null ? null : u_lastName.trim();
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email == null ? null : u_email.trim();
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd == null ? null : u_pwd.trim();
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone == null ? null : u_phone.trim();
    }

    public String getU_Status() {
        return u_Status;
    }

    public void setU_Status(String u_Status) {
        this.u_Status = u_Status == null ? null : u_Status.trim();
    }
}