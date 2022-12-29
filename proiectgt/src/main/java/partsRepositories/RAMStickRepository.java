package partsRepositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productTypes.RAMStick;

@Repository
public interface RAMStickRepository extends CrudRepository<RAMStick, Long> {
}
