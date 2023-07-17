package com.example.password_vault_api.dao;

import com.example.password_vault_api.entity.Site;

import java.util.List;

public interface SiteDAO {

    List<Site> findAll();
}
