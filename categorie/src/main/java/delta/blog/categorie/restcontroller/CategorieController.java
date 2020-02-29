package delta.blog.categorie.restcontroller;

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

import delta.blog.categorie.model.categorie;
import delta.blog.categorie.repositories.CategorieRepository;


@RestController
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRepository;
	
	@GetMapping(value = "/categories")
	public List<categorie> getCategories() {
		System.out.println("---------------------- Get categories ----------------------");
		List<categorie> categories = new ArrayList<categorie>(); 
		categorieRepository.findAll().forEach(categories::add);
		return categories;
	}
	
	@PostMapping(value ="/categorie/add")
	public void addUser(@RequestBody categorie c) {
		System.out.println("---------------------- Create categories ----------------------");
		categorieRepository.save(c);
	}
	
	@DeleteMapping(value = "/categorie/delete{id}")
	public void deleteUser(@PathVariable Long id) {
		categorieRepository.deleteById(id);
	}
	
//	@GetMapping(value = "/articles/{id}")
//	public List<categorie> getArticlesByCategorie(@PathVariable Long id) {
//		System.out.println("---------------------- Get articles by categorie ----------------------");
//		List<categorie> res = new ArrayList<categorie>(); ;
//		Iterable<categorie> users= categorieRepository.findAll();
//		Iterator<categorie> ite = users.iterator();
//		while(ite.hasNext()) {
//			categorie u = ite.next();
//			
//			Long idcategorie = u.getId();
//			if(id==idcategorie) {
//				res.add(u);
//			}
//			
//		}
//		return res;
//	}
}
