package som.som.factory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import som.som.DTO.factoryDTO;
import som.som.DTO.factorySizeDTO;
import som.som.DTO.sizeDTO;

import java.util.ArrayList;

@Service
public class factoryService {
    @Autowired
    private factoryMapper mapper;

    public ArrayList<factoryDTO> selectFactory() throws Exception {
        return mapper.selectFactory();
    }

    public ArrayList<factorySizeDTO> selectFactorySize() throws Exception {
        return mapper.selectFactorySize();
    }

    public ArrayList<sizeDTO> selectSize() throws Exception {
        return mapper.selectSize();
    }
}
