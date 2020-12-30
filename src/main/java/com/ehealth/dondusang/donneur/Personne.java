package com.ehealth.dondusang.donneur;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personne {

    @Id
    @GeneratedValue
    int id_personne;
    String nom;
    String prenom;
    String cin;
    String telephone;
    String adresse;
    Date date_naissance;
    String sexe;

    
    public Personne(int id_personne1, String nom1, String prenom1, String cin1, String telephone1, String adresse1, Date date_naissance1, String sexe1) {
        this.id_personne=id_personne1;
        this.nom=nom1;
        this.prenom=prenom1;
        this.cin=cin1;
        this.telephone=telephone1;
        this.adresse=adresse1;
        this.date_naissance = date_naissance1;
        this.sexe = sexe1;
        
    }

    public Personne(){}

    public int getId_personne() {
        return this.id_personne;
    }

    public void setId_personne(int id_personne) {
        this.id_personne = id_personne;
    }

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

    public String getCin() {
        return this.cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }


     
}
