package springone.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/login")
    public String homPage(){
        return "logintemplate";
    }
    @RequestMapping("/processform")
    public String logFromPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        return "confirm";
    }
}
