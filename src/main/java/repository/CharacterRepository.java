package repository;
import org.springframework.data.repository.CrudRepository;


import repository.model.CharacterStore;

public interface CharacterRepository extends CrudRepository<CharacterStore, Integer> {
    CharacterStore findByUser (String user);
}
