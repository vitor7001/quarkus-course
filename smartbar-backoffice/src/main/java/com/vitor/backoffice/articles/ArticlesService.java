package com.vitor.backoffice.articles;

import com.vitor.smartbar.backoffice.api.model.Article;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArticlesService {

    public Article get(){
        return new Article().name("cola");
    }

}
