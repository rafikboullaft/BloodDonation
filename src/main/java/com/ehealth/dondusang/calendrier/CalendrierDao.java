package com.ehealth.dondusang.calendrier;

import java.util.List;

public interface CalendrierDao {
	
	public List<Calendrier> findAll();
	public Calendrier findById(int id);
	public Calendrier save(Calendrier calendrier);
	public Calendrier update(int id);
	public Calendrier remove(int id);

}