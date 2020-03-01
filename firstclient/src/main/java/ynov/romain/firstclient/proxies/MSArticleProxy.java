package ynov.romain.firstclient.proxies;



import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ynov.romain.firstclient.model.article;

@FeignClient(name ="article")
@RibbonClient(name="article")
public interface MSArticleProxy {
	
	@GetMapping(value="/articles")
	List<article> getArticles();
}