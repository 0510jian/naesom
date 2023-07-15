package som.som.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import som.som.Entity.factory;

@Service
public class factoryService {

    @Autowired
    private som.som.Repository.factoryRepository factoryRepository;

    public Page<factory> getFactory(int page) {
        Pageable pageable = PageRequest.of(page, 3);
        return factoryRepository.findAll(pageable);
    }
}
