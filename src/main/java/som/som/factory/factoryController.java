package som.som.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import som.som.DTO.factoryDTO;
import som.som.DTO.factorySizeDTO;
import som.som.DTO.sizeDTO;
import som.som.Entitty.factory;

import java.util.ArrayList;

@Controller
@RequestMapping("")
public class factoryController {

    @Autowired
    private factoryService service;

    @GetMapping("/factory")
    public ModelAndView factoryMain(
    ) throws Exception {
        ModelAndView mv = new ModelAndView("/factory/factoryList");

        // factory 리스트
        ArrayList<factoryDTO> factoryList = service.selectFactory();
        mv.addObject("factoryList", factoryList);

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
        // sizeList : size 테이블 전체 조회한 것
        mv.addObject("sizeList", sizeList);
        // factorySizeSorted : factorySize 리스트를 사이즈별로 재배열
        mv.addObject("factorySizeSorted", factorySizeSorted);

        return mv;
    }


    @GetMapping("/factory/search")
    public String searchFactory(
            @RequestParam(name = "query") String query
    ) throws Exception {
        return "";
    }

    @GetMapping("/factory/{factoryId}")
    public ModelAndView factoryDetail(
            @PathVariable(value = "factoryId") int factoryId
    ) throws Exception {
        ModelAndView mv = new ModelAndView("/factory/factoryDetail");



        return mv;
    }

}
