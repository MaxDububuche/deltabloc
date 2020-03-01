package ynov.romain.firstclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ynov.romain.firstclient.model.User;
import ynov.romain.firstclient.proxies.MSUserProxy;

import ynov.romain.firstclient.model.auteur;
import ynov.romain.firstclient.proxies.MSAuteurProxy;

import ynov.romain.firstclient.model.article;
import ynov.romain.firstclient.proxies.MSArticleProxy;

@Controller
public class HomeController {

    @Autowired
    private MSUserProxy userProxy;
    @Autowired
    private MSAuteurProxy userProxy2;

    @Autowired
    private MSArticleProxy userProxy3;
    
    @RequestMapping("/toto")
    public String home(Model model){

        List<User> users =  userProxy.getUsers();

        model.addAttribute("users", users);

        return "Home";
        
    }
	
    @RequestMapping("/auteur")
    public String getAuteurs(Model model){
    	System.out.println("!!!!!!!!!!!!! JE SUIS LA !!!!!!!!!!!!!!!!!");
        List<auteur> users =  userProxy2.getUsers();

        model.addAttribute("users", users);

        return "Home";
    }
    
	
    @RequestMapping("/articles")
    public String getArticles(Model model){
    	System.out.println("!!!!!!!!!!!!! JE SUIS LA !!!!!!!!!!!!!!!!!");
        List<article> users =  userProxy3.getArticles();

        model.addAttribute("users", users);

        return "Article";
    }    
}
