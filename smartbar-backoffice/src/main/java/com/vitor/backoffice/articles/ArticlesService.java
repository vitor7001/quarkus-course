package com.vitor.backoffice.articles;

import com.vitor.backoffice.CrudService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class ArticlesService extends CrudService<Article> {

    public ArticlesService() {
        // For CDI needs
        super(null);
    }

    @Inject
    public ArticlesService(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Article> getEntityClass() {
        return Article.class;
    }

}