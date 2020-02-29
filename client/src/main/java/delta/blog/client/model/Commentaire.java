package delta.blog.client.model;

import java.util.Date;


public class Commentaire {
	
	private Long id;
	private Long idauteur;
    private Long idarticle;
    private String texte;  
    private Date date;
    
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
