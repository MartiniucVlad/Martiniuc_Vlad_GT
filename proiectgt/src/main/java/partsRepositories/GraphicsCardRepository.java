package partsRepositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productTypes.GraphicsCard;

@Repository
public interface GraphicsCardRepository extends CrudRepository<GraphicsCard, Long> {
}
