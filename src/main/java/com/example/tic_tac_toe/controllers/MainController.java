package com.example.tic_tac_toe.controllers;

import com.example.tic_tac_toe.model.Matrix;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    Matrix matrix = new Matrix();
    @GetMapping("/tic_tac_toe")
    public String home(Model model) {
        print(model);
        return "tic_tac_toe";
    }
    @RequestMapping(value="/tic_tac_toe", params="first", method = RequestMethod.POST)
    public String first(Model model ){
        matrix.setValue(0,0);
        print(model);
        return "tic_tac_toe";
    }

    @RequestMapping(value="/tic_tac_toe", params="second", method = RequestMethod.POST)
    public String second(Model model ){
        matrix.setValue(0,1);
        print(model);
        return "tic_tac_toe";
    }
    @PostMapping(value="/tic_tac_toe", params="third")
    public String third(Model model ){
        matrix.setValue(0,2);
        print(model);
        return "tic_tac_toe";
    }
    @RequestMapping(value="/tic_tac_toe", params="fourth", method = RequestMethod.POST)
    public String fourth(Model model ){
        matrix.setValue(1,0);
        print(model);
        return "tic_tac_toe";
    }
    @RequestMapping(value="/tic_tac_toe", params="fiveth", method = RequestMethod.POST)
    public String fiveth(Model model ){
        matrix.setValue(1,1);
        print(model);
        return "tic_tac_toe";
    }
    @RequestMapping(value="/tic_tac_toe", params="sixth", method = RequestMethod.POST)
    public String sixth(Model model ){
        matrix.setValue(1,2);
        print(model);
        return "tic_tac_toe";
    }
    @RequestMapping(value="/tic_tac_toe", params="seventh", method = RequestMethod.POST)
    public String seventh(Model model ){
        matrix.setValue(2,0);
        print(model);
        return "tic_tac_toe";
    }
    @RequestMapping(value="/tic_tac_toe", params="eigth", method = RequestMethod.POST)
    public String eigth(Model model ){
        matrix.setValue(2,1);
        print(model);
        return "tic_tac_toe";
    }
    @RequestMapping(value="/tic_tac_toe", params="nineth", method = RequestMethod.POST)
    public String nineth(Model model ){
        matrix.setValue(2,2);
        print(model);
        return "tic_tac_toe";
    }

    public void print(Model model ){
        model.addAttribute("turn",matrix.getTurn());
        model.addAttribute("first", matrix.getValue(0,0));
        model.addAttribute("second", matrix.getValue(0,1));
        model.addAttribute("third", matrix.getValue(0,2));
        model.addAttribute("fourth", matrix.getValue(1,0));
        model.addAttribute("fiveth", matrix.getValue(1,1));
        model.addAttribute("sixth", matrix.getValue(1,2));
        model.addAttribute("seventh", matrix.getValue(2,0));
        model.addAttribute("eigth", matrix.getValue(2,1));
        model.addAttribute("nineth",matrix.getValue(2,2));
    }
    @RequestMapping(value="/tic_tac_toe", params="refresh", method = RequestMethod.POST)
    public String refresh(Model model){
        matrix.refresh();
        return "tic_tac_toe";
    }
}
