package ynov.romain.firstclient.proxies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import  ynov.romain.firstclient.model.commentaire;

@FeignClient(name ="commentaire")
@RibbonClient(name="commentaire")
public interface MSCommentaireProxy {
	@GetMapping(value="/commentaires/{idArticle}")
	List<commentaire> findByArticle(@PathVariable Long idArticle);
	
	@PostMapping(value ="/commentaire/add")
	public void addUser(@RequestBody commentaire c);
}
