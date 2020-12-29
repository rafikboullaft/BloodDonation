package com.ehealth.dondusang.stock;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class stockController {
    @Autowired
    private stockServices stockServices;

    @RequestMapping(value = "/stock", method = RequestMethod.GET)
    public List<paquet> findAllPaquets() {
        return stockServices.getAllPaquets();
    }

    @RequestMapping("paquetId/{id}")
    public Optional<paquet> findOnePaquet(@PathVariable String id) {
        return stockServices.findOne(id);
    }
    @RequestMapping("stock/{type}")
    public List<paquet> findpaquetbytype(@PathVariable String type){
         return stockServices.findByTypes(type);
    }
    @RequestMapping("stock/{type}/{gs}")
    public List<paquet> findPaquetsByGS(@PathVariable String gs){
        return stockServices.findByGroupsanguins(gs);
    }
    @RequestMapping(value ="/stock/{id}", method = RequestMethod.PUT)
    public void updatePaquet(@PathVariable String id,@RequestBody paquet paquet){
        stockServices.updatePaquet(id, paquet);
    }
    @RequestMapping(value = "/stock", method = RequestMethod.POST)
    public void addPaquet(@RequestBody paquet paquet) {
        stockServices.addPaquet(paquet);
    }
    @RequestMapping(value ="/stock/{id}", method = RequestMethod.DELETE)
    public void updatePaquet(@PathVariable String id){
        stockServices.deletePaquet(id);
    }

    
    
}
