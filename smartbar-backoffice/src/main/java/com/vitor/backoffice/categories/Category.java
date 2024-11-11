package com.vitor.backoffice.categories;


import com.vitor.backoffice.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class Category extends BaseEntity {

    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}