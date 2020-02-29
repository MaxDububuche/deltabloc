package delta.blog.client.proxies;


import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import delta.blog.client.model.Auteur;


@FeignClient(name ="ms-gateway")
@RibbonClient(name="auteur")
public interface AuteurProxy {
	@GetMapping(value="/users")
	List<Auteur> getUsers();
	
	@PostMapping(value ="/user/add")
	List<Auteur> addUser(@RequestBody Auteur u);
	
	@DeleteMapping(value = "/delete/{id}")
	Auteur deleteAuteur(@PathVariable("id") Long id);
	
}
