package som.som.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.size;

@Repository
public interface sizeRepository extends JpaRepository<size, Integer> {
}
