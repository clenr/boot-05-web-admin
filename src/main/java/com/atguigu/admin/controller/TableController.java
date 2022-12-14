package com.atguigu.admin.controller;


import com.atguigu.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table.html";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        List<User> users = Arrays.asList(new User("zhang","123"),
                                        new User("li","321"),
                                        new User("wang","444"));
        model.addAttribute("users",users);
        return "table/dynamic_table";
    }

    @GetMapping("editable_table")
    public String editable_table(){
        return "table/editable_table";
    }

    @GetMapping("pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }
    @GetMapping("responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }

}
