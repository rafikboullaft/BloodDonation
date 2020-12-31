package com.ehealth.dondusang.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stockServices {
    @Autowired
    private stockRepository stockRepository;

    // MY DATA befor creating database
    // private List<paquet> stock = new ArrayList<>(Arrays.asList(new paquet("374JDHD", true, "GR", "O+", "01/12/2020"),
    //         new paquet("374J5ID", true, "plasma", "A-", "11/11/2020"),
    //         new paquet("3DJ4JDHD", true, "pl", "B+", "24/12/2020")));

    public List<paquet> getAllPaquets() {
        List<paquet> paquets = new ArrayList<>();
        stockRepository.findAll().forEach(paquets::add);
        return paquets;
    }

    public Optional<paquet> findOne(String CodePaque) {
        return stockRepository.findByCodePaquet(CodePaque);
    }
    public List<paquet> findByTypes(String type){
         return stockRepository.findByType(type);
    }
    public List<paquet> findByGroupsanguins(String groupeSanguin){
         return stockRepository.findByGroupeSanguin(groupeSanguin);
    }
    public void addPaquet(paquet paquet){
        stockRepository.save(paquet);
    }
    public void updatePaquet(String Id,paquet paquet){
        stockRepository.save(paquet);
    }
    public void deletePaquet(String Id){
        stockRepository.deleteById(Id); 
    }

    public List<paquet> ReserveOfGlobules(int numberOfDays){
        return stockRepository.findReserveOfglobules(numberOfDays);
    }
    public List<paquet> ReserveOfPlasma(int numberOfDays){
        return stockRepository.findReserveOfPlasma(numberOfDays);
    }
    public List<paquet> ReserveOfPlaquettes(int numberOfDays){
        return stockRepository.findReserveOfplaquettes(numberOfDays);
    }
    
   
    // public List<paquet> getSizeOfStock(String type,String gs){
    //     List<paquet> paquetType= stockRepository.findByType(type);
    //     return paquetType.stream().filter(p -> p.getGroupeSanguin().equals(gs)).findAny().get();
    // }
    // public int lmkhzoun(String date){
    //     int intervalle;
        
    // }
    



    
}
