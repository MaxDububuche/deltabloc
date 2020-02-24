package delta.blog.commentaire.repositories;

import java.util.Optional;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import delta.blog.commentaire.model.commentaire;

@Repository
public interface CommentaireRepository extends CrudRepository<commentaire, Long>{
	
}
