package delta.blog.firstclient.proxies;



import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import delta.blog.firstclient.model.article;

@FeignClient(name ="article")
@RibbonClient(name="ms-article")
public interface MSArticleProxy {
	
	@GetMapping(value="/articles")
	List<article> getArticles();
	
	@GetMapping(path="/article/{id}")
	article getArticleByid(@PathVariable Long id);
	
	@GetMapping(path="/articles/{idcategorie}")
	List<article> getArticlesByidcategorie(@PathVariable Long idcategorie);
	
	@PostMapping(path="/articles/add")
	List<article> addUser(@RequestBody article c);
}
