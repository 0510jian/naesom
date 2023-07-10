package som.som.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.frame;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface frameRepository extends JpaRepository<frame, Integer> {
    public List<frame> findByIllustratorContaining(String query);
}
