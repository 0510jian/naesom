package som.som.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import som.som.Entity.frame;
import som.som.Entity.license;
import som.som.Util;

import java.util.HashMap;
import java.util.List;

import som.som.Service.frameService;

@Controller
public class frameController {

    @Autowired
    private som.som.Repository.frameRepository frameRepository;

    @Autowired
    private som.som.Repository.licenseRepository licenseRepository;

    @Autowired
    private frameService frameService;

    @GetMapping("/frame")
    public ModelAndView frameMain(
            @RequestParam(name = "page", defaultValue = "0") int page
    ) throws Exception {
        ModelAndView mv = new ModelAndView("frame/frameList");

        // frame 리스트
        Page<frame> frameList = frameService.getFrame(page);

        // metadata 추가
        for(frame frame : frameList) {
            HashMap<String, String> metadata = Util.getMetadataFromUrl(frame.getUrl());
            String description = metadata.get("description");
            String title = metadata.get("title");
            String image = metadata.get("image");
            frame.setMetadata(description, title, image);
        }
        mv.addObject("frameList", frameList);

        // licenseList
        List<license> licenseList = licenseRepository.findAll();
        mv.addObject("licenseList", licenseList);

        return mv;
    }

    @GetMapping("/frame/search")
    public ModelAndView searchFrame(
            @RequestParam(name = "query") String query
    ) throws Exception {
        ModelAndView mv = new ModelAndView("frame/frameList");

        // 검색한 frame 리스트
        List<frame> frameList = frameRepository.findByIllustratorContaining(query);
        mv.addObject("frameList", frameList);

        for(frame frame : frameList) {
            HashMap<String, String> metadata = Util.getMetadataFromUrl(frame.getUrl());
            String description = metadata.get("description");
            String title = metadata.get("title");
            String image = metadata.get("image");
            frame.setMetadata(description, title, image);
        }
        mv.addObject("frameList", frameList);

        // licenseList
        List<license> licenseList = licenseRepository.findAll();
        mv.addObject("licenseList", licenseList);

        return mv;
    }
}
