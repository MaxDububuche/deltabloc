package ynov.romain.firstclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
    @RequestMapping("/categories")
    public String getCategories(Model model){
        List<categorie> categories =  MScategorieProxy.getCategories();

        model.addAttribute("categories", categories);

        return "Categories";
    }
    
    @RequestMapping("/categories/{idcategorie}")
    public String getArticlesByidcategorie(@PathVariable Long idcategorie, Model model){
        List<article> articles =  MSarticleProxy.getArticlesByidcategorie(idcategorie);
        
        model.addAttribute("articles", articles);

        return "Articles";
    }       
}
