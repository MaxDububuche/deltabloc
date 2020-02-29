package delta.blog.article.restcontroller;

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

import delta.blog.article.model.article;
import delta.blog.article.repositories.ArticleRepository;

@RestController
public class ArticleController {
	
	@Autowired
	private ArticleRepository aritcleRepository;
	
	@GetMapping(path="/articles")
	public List<article> getArticles(){
		System.out.println("---------------------- Get articles ----------------------");
		List<article> articles = new ArrayList<article>(); 
		aritcleRepository.findAll().forEach(articles::add);
		return articles;		
	}
	@PostMapping(value ="/articles/add")
	public void addUser(@RequestBody article c) {
		System.out.println("---------------------- Create article ----------------------");
		aritcleRepository.save(c);
	}
	
	@DeleteMapping(value = "/article/delete/{id}")
	public void deleteUser(@PathVariable Long id) {
		aritcleRepository.deleteById(id);
	}
	@GetMapping(path="/articles/{idcategorie}")
	public List<article> getArticlesByidcategorie(@PathVariable Long idcategorie){
		System.out.println("---------------------- Get articles ----------------------");
		List<article> articles = new ArrayList<article>(); 
		aritcleRepository.findByidcategorie(idcategorie).forEach(articles::add);
		return articles;		
	}
	@GetMapping(path="/article/{id}")
	public article getArticleByid(@PathVariable Long id){
		System.out.println("---------------------- Get articles ----------------------");
		article a = aritcleRepository.findByid(id);
		return a;		
	}
}
