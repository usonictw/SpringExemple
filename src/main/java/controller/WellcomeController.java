package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WellcomeController {

    private int visitorCount = 0;

    @RequestMapping(value = " http://localhost:8080/mvc/index.html")
    public String index(Model model) {
        model.addAttribute("visitorCount", visitorCount++);
        return "WEB-INF/pages/index.jsp";
    }

    public int getVisitorCount() {
        return visitorCount;
    }
}

