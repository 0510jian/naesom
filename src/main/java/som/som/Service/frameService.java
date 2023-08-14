package som.som.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import som.som.Entity.frame;
import som.som.Repository.frameRepository;

@Service
public class frameService {
    @Autowired
    private frameRepository frameRepository;

    public Page<frame> getFrame(int page) {
        Pageable pageable = PageRequest.of(page, 999999);
        return frameRepository.findAll(pageable);
    }
}
