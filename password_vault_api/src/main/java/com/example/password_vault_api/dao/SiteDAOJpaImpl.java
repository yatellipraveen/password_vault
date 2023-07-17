package com.example.password_vault_api.dao;

import com.example.password_vault_api.entity.Site;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SiteDAOJpaImpl implements SiteDAO{
    //define field for entitymanager
    private EntityManager entityManager;

    //setup constructor injection
    @Autowired
    public SiteDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Site> findAll() {
        TypedQuery<Site> theQuery = entityManager.createQuery("from Site", Site.class);

        //create a query and get result list
        List<Site> sites = theQuery.getResultList();
        //return the results
        return sites;
    }
}
