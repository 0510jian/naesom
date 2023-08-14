package som.som.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class eventController {
    @GetMapping("/event")
    public ModelAndView eventList(
            @RequestParam(name = "page", defaultValue = "0") int page
    ) throws Exception {
        ModelAndView mv = new ModelAndView("event/eventList");

        // event 리스트

        return mv;
    }
}
