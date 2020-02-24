package delta.blog.article.model;

import javax.persistence.Table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
    @Column(name="id_auteur")
	private Long id_auteur;
    @Column(name="id_categorie")
    private Long id_categorie;
    @Column(name="contenu")
    private String contenu;  
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
	
	public Long getIdCategorie() {
		return id_categorie;
	}
	public void setIdCategorie(Long id_categorie) {
		this.id_categorie = id_categorie;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
}
