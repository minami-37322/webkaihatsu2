package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.Service.UserService;
import com.example.demo2.domain.Questionnnaire;
import com.example.demo2.domain.User;
import com.example.demo2.form.Ex17QuestionnaireForm;
import com.example.demo2.form.UserForm;



@Controller

@RequestMapping("in")
public class Ex17questionnaireController {

    @RequestMapping("")
    public String index(Model model){
        Map<Integer,String> hobbyMap = new LinkedHashMap<>();
        hobbyMap.put(1, "野球");
        hobbyMap.put(2, "サッカー");
        hobbyMap.put(3, "テニス");

        model.addAttribute("hobbyMap",hobbyMap);

        Map<Integer,String> fwMap = new LinkedHashMap<>();
        fwMap.put(1, "java");
        fwMap.put(2, "html");
        fwMap.put(3, "css");

        model.addAttribute("fwMap", fwMap);

        return "ex-17-input";
    }

    @RequestMapping("/create")
    public String create(
        Ex17QuestionnaireForm form,
        RedirectAttributes redirectAttributes
    ){

        Questionnnaire questionnnaire=new Questionnnaire();
        BeanUtils.copyProperties(form, questionnnaire);

        List<String> fwList = new ArrayList<>();
        for(Integer fwCode:form.getFwList()){ //IntegerはformのIntegerを持ってきてる。
            switch(fwCode){
                case 1:
                fwList.add("java");
                break;

                case 2:
                fwList.add("html");
                break;

                case 3:
                fwList.add("css");
                break;
            }

            questionnnaire.setFwList(fwList);

        }

        List<String> hobbyList = new ArrayList<>();
        for(Integer hobbyCode:form.getHobbyList()){
            switch(hobbyCode){
                case 1:
                hobbyList.add("野球");
                break;

                case 2:
                hobbyList.add("サッカー");
                break;

                case 3:
                hobbyList.add("テニス");
                break;
            }
        }

        questionnnaire.setHobbyList(hobbyList);

       redirectAttributes.addFlashAttribute("questionnnaire",questionnnaire);

        return "redirect:/in/toresult";
    }

    @RequestMapping("/toresult")
    public String toresult(){
        return "ex-17-result"; 
    }

    

        }
    
