package delta.blog.firstclient.model;

import java.util.Date;


public class article {
	private Long id;
	private String contenu;
	private Long idcategorie;
	private Long idauteur;
	private String date;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	public Long getIdCategorie() {
		return idcategorie;
	}
	
	public void setIdCategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}
	
	public Long getIdAuteur() {
		return idauteur;
	}
	public void setIdAuteur(Long idauteur) {
		this.idauteur = idauteur;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
