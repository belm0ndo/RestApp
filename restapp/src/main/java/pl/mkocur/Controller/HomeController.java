package pl.mkocur.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mateusz on 14.12.2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

}
