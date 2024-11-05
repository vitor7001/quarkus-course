package com.vitor.backoffice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public abstract class CrudService<E> {

    private final EntityManager entityManager;

    protected CrudService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public E persit(E entity) {
        entityManager.persist(entity);
        return entity;
    }

}