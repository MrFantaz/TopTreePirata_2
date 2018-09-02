package com.herokuapp.toptreepirata.controller;

import com.herokuapp.toptreepirata.repository.CategotyRepository;
import com.herokuapp.toptreepirata.repository.GoodRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

    @Autowired
    private Logger logger;
    @Autowired
    GoodRepository goodsRepository;

    @Autowired
    CategotyRepository categotyRepository;


    @RequestMapping("/search")
    public ModelAndView getGoodsByCategory(@RequestParam("category") String myCategoty, ModelAndView model) {
        logger.trace("log"+categotyRepository.findBySubcategory(myCategoty));
//        model.addObject("goods", goodsRepository.findAllByCategory(categotyRepository.findBySubcategory(myCategoty)));
//        model.setViewName("index");
//        logger.trace("search "+goodsRepository.findAllByCategory(categotyRepository.findBySubcategory(myCategoty)));
//        logger.trace("myCategoty " + myCategoty);
        return model;
    }
}
