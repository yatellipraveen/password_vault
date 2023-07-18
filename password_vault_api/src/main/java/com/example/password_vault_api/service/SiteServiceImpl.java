package com.example.password_vault_api.service;

import com.example.password_vault_api.dao.SiteDAO;
import com.example.password_vault_api.entity.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SiteServiceImpl implements SiteService {
    private SiteDAO siteDAO;

    //consturctor injection
    @Autowired
    public SiteServiceImpl(SiteDAO theSiteDAO){
        siteDAO = theSiteDAO;
    }
    @Override
    public List<Site> findAll() {
        return siteDAO.findAll();
    }

    @Override
    public Site findById(int theId) {
        return siteDAO.findById(theId);
    }

    @Override
    @Transactional
    public Site save(Site theSite) {
        return siteDAO.save(theSite);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        siteDAO.deleteById(theId);
    }
}
