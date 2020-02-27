package delta.blog.auteur.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import delta.blog.auteur.model.auteur;


@Repository
public interface AuteurRepository extends CrudRepository<auteur, Long>{
	
	public auteur findByUsername(String username);

	public Optional<auteur> findByUsernameAndPassword(String username, String password);
}
