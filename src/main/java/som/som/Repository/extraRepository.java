package som.som.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.extra;

@Repository
public interface extraRepository extends JpaRepository<extra, Integer> {
}
