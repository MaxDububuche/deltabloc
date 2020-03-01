package delta.blog.firstclient.model;

import java.util.Date;


public class commentaire {
	
	private Long id;
	private Long idauteur;
    private Long idarticle;
    private String texte;  
    private String date;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdAuteur() {
		return idauteur;
	}
	public void setIdAuteur(Long idauteur) {
		this.idauteur = idauteur;
	}
	
	public Long getIdArticle() {
		return idarticle;
	}
	public void setIdArticle(Long idarticle) {
		this.idarticle = idarticle;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
}


