package com.ehealth.dondusang.donneur;

import org.springframework.data.repository.CrudRepository;

public interface PersonneRepository extends CrudRepository<Personne, Integer>{
    

    // getAllPersonnes()
    // getPersonneById(int id)
    // getPersonneByCin(String cin)
    // updatePersonne(Personne p)
    // deletePersonne(int id)

    
}
