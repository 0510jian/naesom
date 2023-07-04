package som.som.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import som.som.DTO.factoryDTO;
import som.som.DTO.factorySizeDTO;
import som.som.DTO.sizeDTO;

import java.util.ArrayList;

@Controller
@RequestMapping("")
public class factoryController {

    @Autowired
    private factoryService service;

    @GetMapping("/factory")
    public ModelAndView factoryMain(
    ) throws Exception {
        ModelAndView mv = new ModelAndView("/factory/board");

        // factory 리스트
        ArrayList<factoryDTO> factoryList = service.selectFactory();
        mv.addObject("factoryList", factoryList);

        // factorySize 리스트를 사이즈별로 재배열
        ArrayList<factorySizeDTO> factorySizeList = service.selectFactorySize();
        ArrayList<sizeDTO> sizeList = service.selectSize();
        ArrayList<Integer>[] factorySizeSorted = new ArrayList[sizeList.size()];
        for(int i=0; i<factorySizeSorted.length; i++) {
            factorySizeSorted[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<factorySizeList.size(); i++) {
            factorySizeSorted[factorySizeList.get(i).getSizeId()-1].add(factorySizeList.get(i).getFactoryId());
        }

        // size의 개수 = sizeList의 크기
        mv.addObject("size", sizeList.size());

        // sizeList
        mv.addObject("sizeList", sizeList);

        // thymeleaf 이중배열 불가능 => i별로 object 추가
        // ex > size1 object에 sizeId가 1인 factoryId 배열이 들어감
        for(int i=1; i< sizeList.size()+1; i++) {
            mv.addObject("size" + String.valueOf(i), factorySizeSorted[i-1].toArray());
        }

        return mv;
    }

}
