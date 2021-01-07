package com.ehealth.dondusang.stock;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface stockRepository extends CrudRepository<paquet,String> {
    public List<paquet> findByType(String type);
    public List<paquet> findByGroupeSanguin(String groupSanguin);
    public Optional<paquet> findByCodePaquet(String codePaquet);
    //@Query(value = "select * from paquet where type ='globules rouges' and and groupeSanguin=:legroupe",nativeQuery = true)
    @Query(value="select * from paquet WHERE type='globules rouges' AND date_of_donation >= (CURDATE() - INTERVAL :numberOfDays DAY )", nativeQuery = true )
    public List<paquet> findReserveOfglobules(@Param("numberOfDays") int numberOfDays);
    @Query(value = "select * from paquet where type ='plasma' AND date_of_donation >= (CURDATE() - INTERVAL :numberOfDays DAY )",nativeQuery = true)
    List<paquet> findReserveOfPlasma(@Param("numberOfDays") int numberOfDays);
    @Query(value = "select * from paquet where type ='plaquetes' AND date_of_donation >= (CURDATE() - INTERVAL :numberOfDays DAY )",nativeQuery = true)
    List<paquet> findReserveOfplaquettes(@Param("numberOfDays") int numberOfDays);
   
   


    
}
