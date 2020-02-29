package delta.blog.client.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import delta.blog.client.model.Auteur;
import delta.blog.client.proxies.AuteurProxy;

@Controller
public class ClientController {
	@Autowired
	private AuteurProxy auteurProxy;

	@RequestMapping("/")
	public String home(Model model) {
		List<Auteur> users = auteurProxy.getUsers();
		model.addAttribute("users", users);
		return "Home";
	}

}
