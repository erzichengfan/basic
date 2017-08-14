package com.basic.gen.entity;

import com.hitisoft.orm.jpa.BaseDomain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class GPort extends BaseDomain {
    private String nameCn;
    private String nameEn;
    private String code;

    public GPort() {
    }

    @Column(name = "NAME_CN")
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }
    @Column(name = "NAME_EN")
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
