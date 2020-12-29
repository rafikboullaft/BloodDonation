package com.ehealth.dondusang.donneur;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.ehealth.dondusang.calendrier.Calendrier;

@Entity
public class Donneur{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String Cin;
	@OneToOne(mappedBy="donneur")
	Calendrier calendrier;
	
	public Donneur() {
		super();
	}

	public Donneur(String cin, Calendrier calendrier) {
		super();
		Cin = cin;
		this.calendrier = calendrier;
	}
	
}