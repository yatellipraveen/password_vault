package com.example.password_vault_api.rest;

import com.example.password_vault_api.dao.SiteDAO;
import com.example.password_vault_api.entity.Site;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SiteRestController {
    private SiteDAO siteDAO;
    //inject employee dao
    public SiteRestController(SiteDAO theSiteDAO) {
        siteDAO = theSiteDAO;
    }

    //expose "/employees" and return a list of employees
    @GetMapping("/sites")
    public List<Site> findAll() {
        return  siteDAO.findAll();
    }
}
