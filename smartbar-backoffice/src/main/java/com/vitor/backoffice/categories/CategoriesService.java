package com.vitor.backoffice.categories;

import com.vitor.smartbar.backoffice.api.model.Category;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoriesService {

    public Category get(){
        return new Category().name("drinks");
    }

}
