package com.ehealth.dondusang.donneur;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonneurService {

    @Autowired
    private DonneurRepository donneurRepository;

    
    public List<Donneur> getAllDonneurs() {
        List<Donneur> donneurs = new ArrayList<>();
        donneurRepository.findAll().forEach(donneurs::add);
        return donneurs;
    }

    public Optional<Donneur> getDonneurById(int id) {
        return donneurRepository.findById(id);
    }

	public void addDonneur(Donneur donneur) {
        donneurRepository.save(donneur);
	}

	public void updateDonneur(int id, Donneur donneur) {
        donneurRepository.save(donneur);
	}

	public void deleteDonneur(int id) {
		donneurRepository.deleteById(id);
    }

    // Selectionner Donneur Par CIN
	public Donneur getDonneurByCin(String cin) {
        Donneur selectedDonneur = null;
        List<Donneur> donneurs = this.getAllDonneurs();

         for(int i=0; i < donneurs.size(); i++){
             if(donneurs.get(i).getCin().equals(cin)) selectedDonneur = donneurs.get(i);
         }
         return selectedDonneur;
	}
    

}
