package com.herokuapp.toptreepirata.controller;

import com.herokuapp.toptreepirata.model.GoodsEntity;
import com.herokuapp.toptreepirata.repository.CategotyRepository;
import com.herokuapp.toptreepirata.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class SearchGoodsController {

    @Autowired
    GoodRepository goodsRepository;

    @Autowired
    CategotyRepository categotyRepository;

    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.addObject("bycategory",goodsRepository.findAll());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    








//    @GetMapping
//    public String searchByCategoty(@RequestParam("searchCategory") String myCategory) {
//
//        goodsEntitiesList = goodsRepository.findByCategory(categotyRepository.findAllBySubcategory(myCategory));
//        return "index";
//    }

}
