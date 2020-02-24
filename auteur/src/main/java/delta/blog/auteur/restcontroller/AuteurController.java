package delta.blog.auteur.restcontroller;

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
import delta.blog.auteur.model.auteur;

import delta.blog.auteur.repositories.AuteurRepository;
import delta.blog.auteur.model.auteur;

public class AuteurController {
	@Autowired
	private AuteurRepository auteurRepository;
	
	@GetMapping(value = "/auteur/{id}")
	public Optional<auteur> getAuteur(@PathVariable Long id) {
		return auteurRepository.findById(id);
	}
	@GetMapping(value = "/auteurs")
	public List<auteur> getAuteurs() {
		System.out.println("---------------------- Get auteurs ----------------------");
		List<auteur> auteurs = new ArrayList<auteur>(); 
		auteurRepository.findAll().forEach(auteurs::add);
		return auteurs;
	}
	
	@PostMapping(value = "/auteur/add") 
	public void addAuteur(@RequestBody auteur u) {
		System.out.println("---------------------- Add auteur ----------------------");
		auteurRepository.save(u);
	}
	

	@DeleteMapping(value = "/auteur/delete")
	public void deleteAuteur(@RequestBody auteur u) {
		System.out.println("---------------------- Delete auteur ----------------------");
		auteurRepository.delete(u);
	}	
	
	
	@PostMapping(value = "/login")
	public Optional<auteur> login(@RequestBody auteur u) {
		return auteurRepository.findByUsernameAndPassword(u.getUsername(), u.getPassword());
	}
 		
}
