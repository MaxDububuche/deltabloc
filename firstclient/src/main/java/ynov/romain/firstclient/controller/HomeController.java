package ynov.romain.firstclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ynov.romain.firstclient.model.User;
import ynov.romain.firstclient.proxies.MSUserProxy;

import ynov.romain.firstclient.model.auteur;
import ynov.romain.firstclient.proxies.MSAuteurProxy;

import ynov.romain.firstclient.model.article;
import ynov.romain.firstclient.proxies.MSArticleProxy;

import ynov.romain.firstclient.model.categorie;
import ynov.romain.firstclient.proxies.MSCategorieProxy;

import ynov.romain.firstclient.model.commentaire;
import ynov.romain.firstclient.proxies.MSCommentaireProxy;

@Controller
public class HomeController {

    @Autowired
    private MSAuteurProxy MSauteurProxy;

    @Autowired
    private MSArticleProxy MSarticleProxy;
    
    @Autowired
    private MSCategorieProxy MScategorieProxy;
    
    @Autowired
    private MSCommentaireProxy userProxy5;
    
    @RequestMapping("/")
    public String getCategoriesH(Model model){
        List<categorie> categories =  MScategorieProxy.getCategories();

        model.addAttribute("categories", categories);

        return "Categories";
    }
	
    @RequestMapping("/auteurs")
    public String getAuteurs(Model model){
        List<auteur> auteurs =  MSauteurProxy.getUsers();

        model.addAttribute("users", auteurs);

        return "Home";
    }
    
	
    @RequestMapping("/articles")
    public String getArticles(Model model){
        List<article> articles =  MSarticleProxy.getArticles();

        model.addAttribute("articles", articles);

        return "Articles";
    }    
    
    
    @RequestMapping("/article/{idArticle}")
    public String getArticleByid(@PathVariable Long idArticle, Model model){
        article article =  MSarticleProxy.getArticleByid(idArticle);
        List<commentaire> commentaires = userProxy5.findByArticle(idArticle);
        
        model.addAttribute("articles", article);
        model.addAttribute("commentaires", article);

        return "Article";
    }   
    
    
    @RequestMapping(value ="/articles/add", method = RequestMethod.GET)
    public String formulaireArticle(Model model) {
    	article form = new article();
    	model.addAttribute("article", form);
    	
    	return "FormArticle";
    }
    
    @RequestMapping(value="/articles/add", method = RequestMethod.POST)
    public String addArticle(@ModelAttribute("article") @Validated article c, Model model) {
    	System.out.println(c);
    	List<article> articles = MSarticleProxy.addUser(c);
        List<article> articles1 =  MSarticleProxy.getArticles();

        model.addAttribute("articles", articles1);

        return "Articles";
    }

    
    @RequestMapping(value ="/categories/add", method = RequestMethod.GET)
    public String formulaireCategorie(Model model) {
    	categorie form = new categorie();
    	model.addAttribute("categorie", form);
    	
    	return "FormCategorie";
    }
    
    @RequestMapping(value="/categories/add", method = RequestMethod.POST)
    public String addCategorie(@ModelAttribute("categorie") @Validated categorie c, Model model) {
    	System.out.println(c);
    	MScategorieProxy.addUser(c);
        List<categorie> articles1 =  MScategorieProxy.getCategories();

        model.addAttribute("categories", articles1);

        return "Categories";
    }
    
    @RequestMapping("/categories")
    public String getCategories(Model model){
        List<categorie> categories =  MScategorieProxy.getCategories();

        model.addAttribute("categories", categories);

        return "Categories";
    }
    
    @RequestMapping("/categorie/{idcategorie}")
    public String getArticlesByidcategorie(@PathVariable Long idcategorie, Model model){
        List<article> articles =  MSarticleProxy.getArticlesByidcategorie(idcategorie);
        model.addAttribute("articles", articles);
        return "Articles";
    }
   
    @RequestMapping(value ="/commentaires/add", method = RequestMethod.GET)
    public String formulaireCommentaire(Model model) {
    	commentaire form = new commentaire();
    	model.addAttribute("commentaire", form);
    	
    	return "FormCommentaire";
    }
    
    @RequestMapping(value="/commentaires/add", method = RequestMethod.POST)
    public String addCommentaire(@ModelAttribute("commentaire") @Validated commentaire c, Model model) {
    	System.out.println(c);
    	userProxy5.addUser(c);
        article article =  MSarticleProxy.getArticleByid(c.getIdArticle());
        List<commentaire> commentaires = userProxy5.findByArticle(c.getIdArticle());
        
        model.addAttribute("articles", article);
        model.addAttribute("commentaires", article);

        return "Article";
    }
    
    @RequestMapping(value ="/auteurs/add", method = RequestMethod.GET)
    public String formulaireAuteurs(Model model) {
    	auteur form = new auteur();
    	model.addAttribute("auteur", form);
    	
    	return "FormAuteur";
    }
    
    @RequestMapping(value="/auteurs/add", method = RequestMethod.POST)
    public String addAuteurs(@ModelAttribute("auteur") @Validated auteur u, Model model) {
    	System.out.println(u);
    	MSauteurProxy.addUser(u);
        List<auteur> auteurs = MSauteurProxy.getUsers();
        
        
        model.addAttribute("users", auteurs);

        return "Home";
    }  
    
}
