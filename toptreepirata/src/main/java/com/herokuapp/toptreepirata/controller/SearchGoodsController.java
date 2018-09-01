package com.herokuapp.toptreepirata.controller;

import com.herokuapp.toptreepirata.model.GoodsEntity;
import com.herokuapp.toptreepirata.model.UsersEntity;
import com.herokuapp.toptreepirata.repository.CategotyRepository;
import com.herokuapp.toptreepirata.repository.GoodRepository;
import com.herokuapp.toptreepirata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class SearchGoodsController {

//    @Autowired
//    GoodRepository goodsRepository;
//
//    @Autowired
//    CategotyRepository categotyRepository;
//
//    @Value("allGoods")
//    Iterable<GoodsEntity> goodsEntitiesList;



    public String index (){
        //goodsEntitiesList = goodsRepository.findAll();
        return "index";
    }
//
//    @GetMapping
//    public String searchByCategoty(@RequestParam("searchCategory") String myCategory) {
//
//        goodsEntitiesList = goodsRepository.findByCategory(categotyRepository.findAllBySubcategory(myCategory));
//        return "index";
//    }

}
