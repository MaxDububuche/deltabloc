package delta.blog.client.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.openfeign.FeignClient;

import delta.blog.client.model.Auteur;
import delta.blog.client.proxies.AuteurProxy;
import delta.blog.client.model.Article;
import delta.blog.client.proxies.ArticleProxy;

@FeignClient(name ="ms-gateway")
@Controller
public class ClientController {
	@Autowired
	private AuteurProxy auteurProxy;
	private ArticleProxy articleProxy;

	@RequestMapping("/")
	public String home(Model model) {
		System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ça marche");
		List<Auteur> users = auteurProxy.getUsers();
		model.addAttribute("users", users);
		return "Home";
	}
	
	@RequestMapping("/articles")
	public String getArticles(Model model) {
		System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ça marche");
		List<Article> articles = articleProxy.getArticles();
		model.addAttribute("articles", articles);
		return "Home";
	}
}
