package delta.blog.article.repositories;

import java.util.Optional;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import delta.blog.article.model.article;

@Repository
public interface ArticleRepository extends CrudRepository<article, Long>{
	
}
