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
	private ArticleRepository articleRepository;
	
	@GetMapping(value = "/articles")
	public List<article> getArticles() {
		System.out.println("---------------------- Get articles ----------------------");
		List<article> articles = new ArrayList<article>(); 
		articleRepository.findAll().forEach(articles::add);
		return articles;
	}
	
	@PostMapping(value ="/article/add")
	public void addUser(@RequestBody article c) {
		System.out.println("---------------------- Create Article ----------------------");
		articleRepository.save(c);
	}
	
	@DeleteMapping(value = "/article/delete")
	public void deleteUser(@RequestBody article c) {
		System.out.println("---------------------- Delete Article ----------------------");
		articleRepository.delete(c);
	}
	/*
	@GetMapping(value = "/articles/{id_categorie}")
	public List<article> getArticlesByCategorie(@PathVariable Long id_categorie) {
		System.out.println("---------------------- Get articles by categorie ----------------------");
		List<article> articles = new ArrayList<article>(); 
		articleRepository.findByCategorie(id_categorie).forEach(articles::add);
		return articles;
	} 
	@GetMapping(value = "/articles/{id_categorie}")
	public Optional<article> getArticlesByCategorie(@PathVariable Long id_categorie) {
		System.out.println("---------------------- Get articles by categorie ----------------------");
		return articleRepository.findByCategorie(id_categorie);
	}*/
}
