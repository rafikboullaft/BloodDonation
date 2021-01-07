package com.ehealth.dondusang.stock;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class paquet {

    @Id
    @GeneratedValue
    int Id;
    String codePaquet;
    boolean isExpired=false;
    String type;
    String groupeSanguin;
    Date dateOfDonation;

    public paquet(int id, String codePaquet, boolean isExpired, String type, String groupeSanguin,
            Date dateOfDonation) {
        Id = id;
        this.codePaquet = codePaquet;
        this.isExpired = isExpired;
        this.type = type;
        this.groupeSanguin = groupeSanguin;
        this.dateOfDonation = dateOfDonation;
    }
    public paquet(){

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCodePaquet() {
        return codePaquet;
    }

    public void setCodePaquet(String codePaquet) {
        this.codePaquet = codePaquet;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public Date getDateOfDonation() {
        return dateOfDonation;
    }

    public void setDateOfDonation(Date dateOfDonation) {
        this.dateOfDonation = dateOfDonation;
    }
    

   
}
