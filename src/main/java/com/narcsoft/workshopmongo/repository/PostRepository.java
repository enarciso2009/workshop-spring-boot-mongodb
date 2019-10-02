package com.narcsoft.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.narcsoft.workshopmongo.domain.Post;




// somente com este comando abaixo é possivel alterar deletar criar sem necessidade de criar uma linha p


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	List<Post> findByTitleContainingIgnoreCase(String Text); // monta uma consulta automaticamente na base de dados para localizar um texto no banco de dados...
	
	
	
	}
