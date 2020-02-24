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
    @Column(name="id_auteur")
	private Long id_auteur;
    @Column(name="id_article")
    private Long id_article;
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
		return id_auteur;
	}
	public void setIdAuteur(Long id_auteur) {
		this.id_auteur = id_auteur;
	}
	
	public Long getIdArticle() {
		return id_article;
	}
	public void setIdArticle(Long id_article) {
		this.id_article = id_article;
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
