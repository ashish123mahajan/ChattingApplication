package dac.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dac.pojo.Messages;

@Repository
public interface MessageRepository extends CrudRepository<Messages, Long>{

}
