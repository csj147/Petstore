package com.nf147.controller;

import com.nf147.dao.*;

import com.nf147.entity.Category;
import com.nf147.entity.Pet;
import com.nf147.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class PetController {

    @Autowired
    private PetMapper petMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    private List<Category> categorys;
    private List<Pet> pets;

    @RequestMapping(method = RequestMethod.GET)
    public String Pet(Model model){

        categorys = categoryMapper.selectAll();
        pets = petMapper.select_join();

        model.addAttribute("categorys",categorys);
        model.addAttribute("pets",pets);

        return "Pet";
    }

    @RequestMapping(value = "/select_where/{c_id}")
    public String sel_where(@PathVariable("c_id") int c_id ,Model model){

        pets = petMapper.select_id(c_id);

        model.addAttribute("categorys",categorys);
        model.addAttribute("pets",pets);

        return "Pet";
    }

    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") int id){
        petMapper.deleteByPrimaryKey(id);
        return "redirect:/";
    }

    @RequestMapping("/tz")
    public String tz(){


        return "redirect:/in_to";
    }

//    @RequestMapping("/tj")
//    public String tj(Pet pet){
//
//        return "";
//    }
}
