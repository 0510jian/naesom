package som.som.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import som.som.Entity.factory;
import som.som.Entity.factoryExtra;
import som.som.Entity.factorySize;
import som.som.Entity.size;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("")
public class factoryController {
    @Autowired
    private som.som.Service.factoryService factoryService;

    @Autowired
    private som.som.Repository.factoryRepository factoryRepository;
    @Autowired
    private som.som.Repository.sizeRepository sizeRepository;
    @Autowired
    private som.som.Repository.factorySizeRepository factorySizeRepository;
    @Autowired
    private som.som.Repository.extraRepository extraRepository;
    @Autowired
    private som.som.Repository.factoryExtraRepository factoryExtraRepository;


    @GetMapping("/factory")
    public ModelAndView factoryMainPaging(
            @RequestParam(name = "page", defaultValue = "0") int page
    ) throws Exception {
        ModelAndView mv = new ModelAndView("factory/factoryList");

        // factory 리스트
        Page<factory> factoryList = factoryService.getFactory(page);
        mv.addObject("factoryList" ,factoryList);

        List<factorySize> factorySizeList = factorySizeRepository.findAll();
        List<size> sizeList = sizeRepository.findAll();
        // size를 오름차순 정렬
        sizeList.sort(new Comparator<size>() {
            @Override
            public int compare(size o1, size o2) {
                return Integer.parseInt(o1.getSize()) - Integer.parseInt(o2.getSize());
            }
        });

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
    public ModelAndView searchFactory(
            @RequestParam(name = "query") String query
    ) throws Exception {
        ModelAndView mv = new ModelAndView("factory/factoryList");

        // 검색한 factory 리스트
        List<factory> factoryList = factoryRepository.findByKoNameContaining(query);
        mv.addObject("factoryList", factoryList);

        List<factorySize> factorySizeList = factorySizeRepository.findAll();
        List<size> sizeList = sizeRepository.findAll();
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

    @GetMapping("/factory/{factoryId}")
    public ModelAndView factoryDetail(
            @PathVariable(value = "factoryId") int factoryId
    ) throws Exception {
        ModelAndView mv = new ModelAndView("factory/factoryDetail");

        // factoryId에 해당하는 factory 객체
        Optional<factory> factory = factoryRepository.findById(factoryId);
        mv.addObject("factory", factory);

        // factoryId에 해당하는 factoryExra(옵션 단가)와 option(옵션명)
        List<factoryExtra> factoryExtraList = factoryExtraRepository.findByFactoryId(factoryId);
        for(factoryExtra fe : factoryExtraList) {
            fe.setOption(extraRepository.findById(fe.getExtraId()).get().getOption());
        }
        mv.addObject("factoryExtraList", factoryExtraList);

        return mv;
    }

}
