package delta.blog.commentaire.model;

import javax.persistence.Table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
    @Column(name="idauteur")
	private Long idauteur;
    @Column(name="idarticle")
    private Long idarticle;
    @Column(name="texte")
    private String texte;  
    @Column(name="date")
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

	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
}
