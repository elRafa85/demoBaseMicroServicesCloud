package com.example.demo;

import com.example.dao.TeamDao;
import com.example.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rafae on 8/22/2017.
 */
@Controller
public class DemoController {

    @Autowired
    TeamDao teamDao;

    @RequestMapping("/hi/{name}")
    public String hiThere(Model model, @PathVariable String name){
        model.addAttribute(name,"name");
        return "hello";
    }
}
