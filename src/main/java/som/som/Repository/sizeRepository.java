package som.som.Repository;

import org.hibernate.annotations.SortComparator;
import org.hibernate.annotations.SortNatural;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import som.som.Entity.size;

import java.util.List;

@Repository
public interface sizeRepository extends JpaRepository<size, Integer> {

}
