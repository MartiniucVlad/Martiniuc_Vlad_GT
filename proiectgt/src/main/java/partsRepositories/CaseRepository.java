
package partsRepositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import productTypes.OuterCase;

@Repository
public interface CaseRepository extends CrudRepository<OuterCase, Long> {
}
