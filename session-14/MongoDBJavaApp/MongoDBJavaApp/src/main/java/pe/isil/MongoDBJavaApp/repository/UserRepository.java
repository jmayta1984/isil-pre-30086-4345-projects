package pe.isil.MongoDBJavaApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.isil.MongoDBJavaApp.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    public List<User> findByName(String name);
}
