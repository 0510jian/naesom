package som.som.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import org.springframework.data.domain.Page;
import som.som.Entity.factory;
import som.som.Service.factoryService;
import som.som.Repository.factoryRepository;

import java.util.List;


@SpringBootTest
class factoryControllerTest {

    @Autowired
    factoryService factoryService;

    @Autowired
    factoryRepository factoryRepository;

    @Test
    public void selectFactory() {
        Page<factory> factoryList = factoryService.getFactory(0);
    }

    @Test
    public void selectFactoryContainingQuery() {
        List<factory> factoryList = factoryRepository.findByKoNameContaining("공장");
    }
}