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
public class PersonneController {

    @Autowired
    private PersonneService personneservice;

    @RequestMapping("/personnes")
    public List<Personne> getAllPersonnes() {
        return personneservice.getAllPersonnes();
    }

    @RequestMapping("/personnes/{id}")
    public Optional<Personne> getPersonneById(@PathVariable int id) {
        return personneservice.getPersonneById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/personnes")
    public void addPersonne(@RequestBody Personne personne){
        personneservice.addPersonne(personne);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/personnes/{id}")
    public void updatePersonne(@RequestBody Personne personne, @PathVariable int id){
        personneservice.updatePersonne(id, personne);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/personnes/{id}")
    public void deletePersonne( @PathVariable int id){
        personneservice.deletePersonne(id);
    }


    // ------------------------------------ Methodes -------------------------------------

    @RequestMapping("/personnes/cin/{cin}")
    public Personne getPersonneByCin(@PathVariable String cin) {
        return personneservice.getPersonneByCin(cin);
    }

    


}