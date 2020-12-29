package com.ehealth.dondusang.stock;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface stockRepository extends CrudRepository<paquet,String> {
    public List<paquet> findByType(String type);
    public List<paquet> findByGroupeSanguin(String groupSanguin);


    
}
