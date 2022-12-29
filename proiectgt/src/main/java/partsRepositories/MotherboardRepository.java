package partsRepositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productTypes.Motherboard;

@Repository
public interface MotherboardRepository extends CrudRepository<Motherboard, Long> {
}
