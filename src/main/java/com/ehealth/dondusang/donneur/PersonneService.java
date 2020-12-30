package com.ehealth.dondusang.donneur;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepository personnerepository;

    
    public List<Personne> getAllPersonnes() {
        List<Personne> personnes = new ArrayList<>();
        personnerepository.findAll().forEach(personnes::add);
        return personnes;
    }

    public Optional<Personne> getPersonneById(int id) {
        return personnerepository.findById(id);
    }

	public void addPersonne(Personne personne) {
        personnerepository.save(personne);
	}

	public void updatePersonne(int id, Personne personne) {
        personnerepository.save(personne);
	}

	public void deletePersonne(int id) {
		personnerepository.deleteById(id);
	}

	public Personne getPersonneByCin(String cin) {
		Personne selectedPersonne = null;
        List<Personne> personnes = this.getAllPersonnes();

         for(int i=0; i < personnes.size(); i++){
             if(personnes.get(i).getCin().equals(cin)) selectedPersonne = personnes.get(i);
         }
         return selectedPersonne;
	}
    
}