package com.vitor.backoffice;

import com.example.smartbar.backoffice.api.model.Article;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArticlesService {

    public Article get(){
        return new Article().name("cola");
    }

}
