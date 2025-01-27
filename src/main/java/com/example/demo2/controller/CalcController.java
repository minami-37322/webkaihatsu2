package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.form.CalcForm;

@Controller
@RequestMapping("/calc")
public class CalcController {

    @RequestMapping("")
    public String index(){

        return "calc";

    }

    @RequestMapping("/inputNum")
    public String inputNum(CalcForm form,Model model){
        double num1=Double.parseDouble(form.getNum1());
        double num2=Double.parseDouble(form.getNum2());
        String operator=form.getOperator();
        double result=switch(operator){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "×" -> num1*num2;
            case "÷" ->{
                if(num2==0){
                    throw new ArithmeticException("ゼロで割ることはできません");
                }
                yield num1/num2;
            }
            default -> throw new IllegalAccessError("無効な演算子です:"+operator);
        };

        model.addAttribute("num1", num1);
        model.addAttribute("operator", operator);
        model.addAttribute("num2", num2);
        model.addAttribute("answer", result);
        return "calc-result.html";

    }

}
