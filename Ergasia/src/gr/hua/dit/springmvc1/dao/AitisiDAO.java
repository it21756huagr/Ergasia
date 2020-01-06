package gr.hua.dit.springmvc1.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import gr.hua.dit.springmvc1.entity.Aitisi;


public interface AitisiDAO {

	public List<Aitisi> getAitisis();
	
	public List<Aitisi> getAitisisDESC();
	
	public void saveAitisi(Aitisi aitisi);
	
	public void deleteAitisi(String aitisi_id);

	public Aitisi getAitisi(HttpServletRequest request,Aitisi object);

	


	
	

	
}

