package dac.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dac.pojo.Participants;

@Repository
public interface ParticipantsRepository extends CrudRepository<Participants, Long>{

}