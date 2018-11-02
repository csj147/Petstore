package com.nf147.entity;

public class Pet {
    private Integer pet_id;

    private Integer category_id;

    private String pet_name;

    private String pet_photoUrls;

    private Integer tag_id;

    private String status;

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name == null ? null : pet_name.trim();
    }

    public String getPet_photoUrls() {
        return pet_photoUrls;
    }

    public void setPet_photoUrls(String pet_photoUrls) {
        this.pet_photoUrls = pet_photoUrls == null ? null : pet_photoUrls.trim();
    }

    public Integer getTag_id() {
        return tag_id;
    }

    public void setTag_id(Integer tag_id) {
        this.tag_id = tag_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}