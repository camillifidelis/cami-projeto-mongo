package com.camillifidelis.workshopmongo.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.camillifidelis.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findById(String id);

}
