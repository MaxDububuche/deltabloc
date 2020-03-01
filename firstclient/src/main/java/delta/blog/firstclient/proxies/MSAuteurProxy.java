package delta.blog.firstclient.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import delta.blog.firstclient.model.auteur;

@FeignClient(name = "auteur")
@RibbonClient(name= "ms-gateway")
public interface MSAuteurProxy {

	@GetMapping(value = "/users")
	List<auteur> getUsers();
	
	@GetMapping( value = "/user/{id}")
	Optional<auteur> getUser(@PathVariable("id") Long id);
	
	@PostMapping(value ="/add")
	public void addUser(@RequestBody auteur u);
}
