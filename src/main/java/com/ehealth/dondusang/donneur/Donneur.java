package com.ehealth.dondusang.donneur;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Donneur extends Personne {

    @Id
    @GeneratedValue
    int id_donneur;
    Date dernier_don;
    Boolean etat_sante; // Good-true // Not Good= false
    String groupe_sanguain;

    public Donneur(int id_personne1, String nom1, String prenom1, String cin1, String telephone1, String adresse1,
            Date date_naissance1, String sexe1, int id_donneur1, Date dernier_don1, Boolean etat_sante1,
            String groupe_sanguain1) {
        super(id_personne1, nom1, prenom1, cin1, telephone1, adresse1, date_naissance1, sexe1);
        this.id_donneur = id_donneur1;
        this.dernier_don = dernier_don1;
        this.etat_sante = etat_sante1;
        this.groupe_sanguain = groupe_sanguain1;
    }

    public Donneur() {
    }

    public int getId_donneur() {
        return this.id_donneur;
    }

    public void setId_donneur(int id_donneur) {
        this.id_donneur = id_donneur;
    }

    public Date getDernier_don() {
        return this.dernier_don;
    }

    public void setDernier_don(Date dernier_don) {
        this.dernier_don = dernier_don;
    }

    public Boolean getEtat_sante() {
        return this.etat_sante;
    }

    public void setEtat_sante(Boolean etat_sante) {
        this.etat_sante = etat_sante;
    }

    public String getGroupe_sanguain() {
        return this.groupe_sanguain;
    }

    public void setGroupe_sanguain(String groupe_sanguain) {
        this.groupe_sanguain = groupe_sanguain;
    }

    // public boolean isEligible() {
    //     Date today=new Date();
    //     long ltime=today.getTime()+8*24*60*60*1000;
    //     Date today8=new Date(ltime);
        
    //     if (this.etat_sante == true && this.sexe == "Homme"  );
    
    //     return false;
    // }
    
    
}
