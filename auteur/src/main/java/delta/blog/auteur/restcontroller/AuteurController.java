package delta.blog.auteur.restcontroller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


import delta.blog.auteur.repositories.AuteurRepository;
import delta.blog.auteur.model.auteur;

@RestController
public class AuteurController {
	
	@Autowired
	private AuteurRepository auteurRepository;
	
	@GetMapping(value = "/users")
	public List<auteur> getUsers() {
		List<auteur> users = new ArrayList<auteur>(); 
		auteurRepository.findAll().forEach(users::add);
		return users;
	}
	
	@PostMapping(value ="/add")
	public void addUser(@RequestBody auteur u) {
		auteurRepository.save(u);
	}
	@PutMapping(value = "/update")
	public void updateUser(@RequestBody auteur u) {
		auteurRepository.save(u);
	}
	@DeleteMapping(value = "/delete")
	public void deleteUser(@RequestBody auteur u) {
		auteurRepository.delete(u);
	}
	
	@PostMapping(value = "/login")
	public Optional<auteur> login(@RequestBody auteur u){
		return auteurRepository.findByUsernameAndPassword(u.getUsername(), u.getPassword());
	}
}
	
