package by.epam.lab.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

    @RequestMapping("/")
    public String show(){
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(){
        return "show-emp-view";
    }

}
