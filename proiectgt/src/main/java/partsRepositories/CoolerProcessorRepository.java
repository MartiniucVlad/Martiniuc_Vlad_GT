package partsRepositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productTypes.CoolerProcessor;

@Repository
public interface CoolerProcessorRepository extends CrudRepository<CoolerProcessor, Long> {
}
