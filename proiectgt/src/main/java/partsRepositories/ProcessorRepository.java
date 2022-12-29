package partsRepositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productTypes.Processor;

@Repository
public interface ProcessorRepository extends CrudRepository<Processor, Long> {
}
