package com.lzb.controller;

import com.lzb.pojo.Hero;
import com.lzb.service.HeroService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luzhibin on 2019/11/5 13:32
 */
@RestController
@Slf4j
public class MyController {

    @Autowired
    private HeroService heroService;

  //  private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @RequestMapping("/hello")
    public String hello(){
        log.info("info log-info-------------------");
        log.debug("debug log-debug");
        List<Hero> allHero = heroService.getAllHero();
        Hero select = heroService.select();
        List<Hero> heroes = heroService.selectAll();
        Hero hero = heroService.selectByPrimaryKey();
        System.out.println("Controller层：selectAll:---"+heroes);
        System.out.println("Controller层：select---"+select);
        System.out.println("Controller层：getAllHero:---"+allHero);
        System.out.println("Controller层：selectByPrimaryKey---"+hero);
        return "hello";
    }
}
