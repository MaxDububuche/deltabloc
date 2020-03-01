package delta.blog.client.proxies;



import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import delta.blog.client.model.Article;

//@FeignClient(name ="ms-gateway")
@RibbonClient(name="article")
public interface ArticleProxy {
	
	@GetMapping(value="/articles")
	List<Article> getArticles();
}
