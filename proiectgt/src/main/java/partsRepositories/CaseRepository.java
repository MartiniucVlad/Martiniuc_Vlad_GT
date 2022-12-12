
package partsRepositories;

import org.springframework.data.repository.CrudRepository;
import productTypes.OuterCase;

public interface CaseRepository extends CrudRepository<OuterCase, Long> {
}
