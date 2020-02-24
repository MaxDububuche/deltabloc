package delta.blog.commentaire.restcontroller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import delta.blog.commentaire.model.commentaire;
import delta.blog.commentaire.repositories.CommentaireRepository;

@RestController
public class CommentaireController {
	
	@Autowired
	private CommentaireRepository commentaireRepository;
	
	@GetMapping(value = "/commentaires")
	public List<commentaire> getCategories() {
		System.out.println("---------------------- Get comentaire ----------------------");
		List<commentaire> commentaires = new ArrayList<commentaire>(); 
		commentaireRepository.findAll().forEach(commentaires::add);
		return commentaires;
	}
	
	@PostMapping(value ="/commentaire/add")
	public void addUser(@RequestBody commentaire c) {
		System.out.println("---------------------- Create commentaire ----------------------");
		commentaireRepository.save(c);
	}
	
	@DeleteMapping(value = "/commentaire/delete")
	public void deleteUser(@RequestBody commentaire c) {
		System.out.println("---------------------- Delete commentaire ----------------------");
		commentaireRepository.delete(c);
	}
	
	@GetMapping(value="/commentaire/{id_article]")
	public List<commentaire> findByArticle(@PathVariable Long id_article) {
		System.out.println("---------------------- Get Commentaire by article ----------------------");
		List<commentaire> commentaires = new ArrayList<commentaire>(); 
		commentaireRepository.findAll().forEach(commentaires::add);
		return commentaires;
	}
}
