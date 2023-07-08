package som.som.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.factory;

import java.util.List;

@Repository
public interface factoryRepository extends JpaRepository<factory, Integer> {
    public List<factory> findByKoNameContaining(String query);
}
