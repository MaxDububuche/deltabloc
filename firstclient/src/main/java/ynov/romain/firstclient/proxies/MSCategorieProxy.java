package ynov.romain.firstclient.proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import ynov.romain.firstclient.model.categorie;

@FeignClient(name ="categorie")
@RibbonClient(name="categorie")
public interface MSCategorieProxy {
	
	@GetMapping(value="/categories")
	List<categorie> getCategories();
}
