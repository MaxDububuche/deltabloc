package delta.blog.article.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import delta.blog.article.model.article;

@Repository
public interface ArticleRepository extends CrudRepository<article, Long>{
	
	public List<article> findByidcategorie(Long idCategorie);
	public article findByid(Long id);
}
