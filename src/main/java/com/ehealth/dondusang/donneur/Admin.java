package com.ehealth.dondusang.donneur;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    String id_admin;
    String nom;
    String prenom;
    String cin;
    String telephone;

    public Admin(String id_admin1, String nom1, String prenom1, String cin1, String telephone1){
        this.id_admin=id_admin1;
        this.nom=nom1;
        this.prenom=prenom1;
        this.cin=cin1;
        this.telephone=telephone1;
    }
    public Admin(){}


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}