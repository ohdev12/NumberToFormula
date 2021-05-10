package com.ohdev.math.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LevelTwo {

    @Id
    private Long number;

    private String unit;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
