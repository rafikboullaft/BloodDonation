package com.ehealth.dondusang.stock;

import javax.persistence.Entity;


@Entity
public class paquet {

    @javax.persistence.Id
    String Id;
    boolean isExpired=false;
    String type;
    String groupeSanguin;
    String dateOfDonation;

    public paquet(String Id, boolean isExpired, String type, String groupeSanguin, String dateOfDonation) {
        this.Id=Id;
        this.isExpired = isExpired;
        this.type = type;
        this.groupeSanguin = groupeSanguin;
        this.dateOfDonation = dateOfDonation;
    }
    
    public String getId(){
        return Id;
    }
    public void setId(String id){
        Id=id;
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

    public String getDateOfDonation() {
        return dateOfDonation;
    }

    public void setDateOfDonation(String dateOfDonation) {
        this.dateOfDonation = dateOfDonation;
    }

    public paquet() {
    }
}
