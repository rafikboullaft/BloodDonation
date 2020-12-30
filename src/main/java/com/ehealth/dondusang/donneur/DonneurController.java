package com.ehealth.dondusang.donneur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonneurController {

    @Autowired
    private DonneurService donneurservice;

    @RequestMapping("/donneurs")
    public List<Donneur> getAllDonneurs() {
        return donneurservice.getAllDonneurs();
    }

    @RequestMapping("/donneurs/{id}")
    public Optional<Donneur> getDonneurById(@PathVariable int id) {
        return donneurservice.getDonneurById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/donneurs")
    public void addDonneur(@RequestBody Donneur donneur){
        donneurservice.addDonneur(donneur);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/donneurs/{id}")
    public void updateDonneur(@RequestBody Donneur donneur, @PathVariable int id){
        donneurservice.updateDonneur(id, donneur);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/donneurs/{id}")
    public void deleteDonneur( @PathVariable int id){
        donneurservice.deleteDonneur(id);
    }

    // ------------------------------------ Methodes -------------------------------------

    @RequestMapping("/donneurs/cin/{cin}")
    public Donneur getDonneurByCin(@PathVariable String cin) {
        return donneurservice.getDonneurByCin(cin);
    }

    
    
    
}
