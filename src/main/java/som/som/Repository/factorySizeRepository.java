package som.som.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.factorySize;

@Repository
public interface factorySizeRepository extends JpaRepository<factorySize, Integer> {
}
