package som.som.factory;

import org.apache.ibatis.annotations.Mapper;
import som.som.DTO.factoryDTO;
import som.som.DTO.factorySizeDTO;
import som.som.DTO.sizeDTO;

import java.util.ArrayList;

@Mapper
public interface factoryMapper {
    public ArrayList<factoryDTO> selectFactory() throws Exception;
    public ArrayList<factorySizeDTO> selectFactorySize() throws Exception;
    public ArrayList<sizeDTO> selectSize() throws Exception;

}





