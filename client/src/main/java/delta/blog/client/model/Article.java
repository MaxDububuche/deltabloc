package delta.blog.client.model;

import java.util.Date;


public class Article {
	private Long id;
	private String contenu;
	private Long idcategorie;
	private Long idauteur;
	private Date date;

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
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
