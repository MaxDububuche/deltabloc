package delta.blog.article.model;

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
	@Column(name="contenu")
	private String contenu;
	@Column(name="idcategorie")
	private Long idcategorie;
	@Column(name="idauteur")
	private Long idauteur;
	@Column(name="Date")
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
