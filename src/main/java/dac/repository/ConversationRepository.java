package dac.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dac.pojo.Conversation;

@Repository
public interface ConversationRepository extends CrudRepository<Conversation, Long>{

}