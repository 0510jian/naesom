package som.som.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.factoryExtra;

import java.util.List;

@Repository
public interface factoryExtraRepository extends JpaRepository<factoryExtra, Integer> {
    public List<factoryExtra> findByFactoryId(int factoryId);
}
