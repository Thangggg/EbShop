package com.example.ebshop.model;

import javax.persistence.*;

@Entity
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String website;
    private String founder;
    private Integer founderYear;
    private String address;

    public Publisher(String name, String website, String founder, Integer founderYear, String address) {
        this.name = name;
        this.website = website;
        this.founder = founder;
        this.founderYear = founderYear;
        this.address = address;
    }

    public Publisher() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Integer getFounderYear() {
        return founderYear;
    }

    public void setFounderYear(Integer founderYear) {
        this.founderYear = founderYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
