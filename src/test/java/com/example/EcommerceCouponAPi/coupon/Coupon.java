package com.example.EcommerceCouponAPi.coupon;

import jakarta.persistence.*;

@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "coupon_type")
    private String type;
    @Column(name = "detail")
    private String details;
    @Column(name = "repeat_limit")
    private Integer repetitionLimit;
    @Column(name = "is_active")
    private Boolean activeStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getRepetitionLimit() {
        return repetitionLimit;
    }

    public void setRepetitionLimit(Integer repetitionLimit) {
        this.repetitionLimit = repetitionLimit;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString(){
        return "Coupon [id=" + id + ", type=" + type + ", details=" +  details + ", repetitionLimit=" + repetitionLimit + ", activeStatus=" + activeStatus + "]";

    }
}
