package som.som.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.factory;

@Repository
public interface factoryRepository extends JpaRepository<factory, Integer> {
}
