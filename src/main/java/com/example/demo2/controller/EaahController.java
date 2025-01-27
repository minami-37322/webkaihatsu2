package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.Item1;

@Controller
@RequestMapping("/each")
public class EaahController {

    @RequestMapping("")
    public String index(Model model){
        List<Item1> itemList=new ArrayList<>();
        itemList.add(new Item1("えんぴつ",120,"緑"));
        itemList.add(new Item1("パソコン",198000,"シルバー"));
        itemList.add(new Item1("水筒",2180,"白"));

        model.addAttribute("itemList", itemList);

        return "each";

    }

}
