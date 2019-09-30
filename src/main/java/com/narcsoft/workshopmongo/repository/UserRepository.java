package com.narcsoft.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.narcsoft.workshopmongo.domain.User;
// somente com este comando abaixo é possivel alterar deletar criar sem necessidade de criar uma linha p
@Repository
public interface UserRepository extends MongoRepository<User, String> {



	
    


	}
