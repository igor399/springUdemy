package by.epam.lab.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmployees() {
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoForHR() {
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoForManagers() {
        return "view-for-managers";
    }

}
