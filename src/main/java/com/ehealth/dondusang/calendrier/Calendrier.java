package com.ehealth.dondusang.calendrier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ehealth.dondusang.donneur.Donneur;
@Entity
@Table(name="calendrier") 
public class Calendrier {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	//String cinDonneur;
	Date Rdv;
	@OneToOne
	@JoinColumn(name = "donneur_id")
	Donneur donneur;
	
	public Calendrier() {
		super();
	}
	
public Calendrier(Date rdv, Donneur donneur) {
		super();
		Rdv = rdv;
		this.donneur = donneur;
	}

//	public String getCinDonneur() {
//		return cinDonneur;
//	}
//	public void setCinDonneur(String cinDonneur) {
//		this.cinDonneur = cinDonneur;
//	}
	public Date getRdv() {
		return Rdv;
	}
	public void setRdv(Date rdv) {
		Rdv = rdv;
	}
	
    
}
