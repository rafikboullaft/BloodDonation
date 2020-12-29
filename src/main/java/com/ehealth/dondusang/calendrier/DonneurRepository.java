package com.ehealth.dondusang.calendrier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ehealth.dondusang.donneur.Donneur;

@RepositoryRestResource
public interface DonneurRepository extends JpaRepository<Donneur, Long>{

}
