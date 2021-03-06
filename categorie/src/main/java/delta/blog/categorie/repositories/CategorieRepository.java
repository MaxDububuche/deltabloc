package delta.blog.categorie.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import delta.blog.categorie.model.categorie;

@Repository
public interface CategorieRepository extends CrudRepository<categorie, Long>{
	
	public categorie findByName(String name);

}
