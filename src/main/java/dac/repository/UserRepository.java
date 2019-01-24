package dac.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dac.pojo.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}