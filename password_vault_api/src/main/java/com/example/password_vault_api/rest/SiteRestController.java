package com.example.password_vault_api.rest;

import com.example.password_vault_api.dao.SiteDAO;
import com.example.password_vault_api.entity.Site;
import com.example.password_vault_api.service.SiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SiteRestController {
    private SiteService siteService;
    //inject Site Service
    public SiteRestController(SiteService theSiteService) {
        siteService = theSiteService;
    }

    //expose "/sites" and return a list of sites
    @GetMapping("/sites")
    public List<Site> findAll() {
        return  siteService.findAll();
    }

    //add mapping for GET /sites/{siteId}
    @GetMapping("/sites/{siteId}")
    public Site getSite(@PathVariable int siteId){
        Site theSite = siteService.findById(siteId);

        if(theSite == null){
            throw new RuntimeException("Site id not found - " + siteId);
        }

        return theSite;
    }

    //mapping for POST /sites - add new site
    @PostMapping("/sites")
    public Site addSite(@RequestBody Site theSite){
        theSite.setId(0);

        Site dbSite = siteService.save(theSite);

        return dbSite;
    }

    //mapping for PUT /sites - update site
   @PutMapping("/sites")
   public Site updateSite(@RequestBody Site theSite){
        Site dbSite = siteService.save(theSite);
        return dbSite;
   }

    //mapping for DELETE /sites - delete existing site
    @DeleteMapping("/sites/{siteId}")
    public String deleteSite(@PathVariable int siteId){
        Site theSite = siteService.findById(siteId);

        //throw exception

        if(theSite == null){
            throw new RuntimeException("Site not found - " + siteId);
        }

        siteService.deleteById(siteId);
        return "Deleted site id - "+ siteId;
    }
}
