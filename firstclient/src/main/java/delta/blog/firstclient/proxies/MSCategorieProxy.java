package delta.blog.firstclient.proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import delta.blog.firstclient.model.categorie;

@FeignClient(name ="categorie")
@RibbonClient(name="gateway-categorie")
public interface MSCategorieProxy {
	
	@GetMapping(value="/categories")
	List<categorie> getCategories();
	
	@PostMapping(value ="/categorie/add")
	public void addUser(@RequestBody categorie c);
}
