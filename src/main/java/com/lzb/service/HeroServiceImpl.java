package com.lzb.service;

import com.lzb.mapper.HeroMapper;
import com.lzb.pojo.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luzhibin on 2019/11/5 23:35
 */
@Service
public class HeroServiceImpl implements HeroService{

    @Autowired
    private HeroMapper heroMapper;

    @Override
    public List<Hero> getAllHero() {
        List<Hero> heroes = heroMapper.getAllHero();
        System.out.println("Service层：getAllHero---"+heroes);
        return heroMapper.getAllHero();
    }
    @Override
    public Hero select() {
        Hero hero = new Hero();
        hero.setId(7);
        List<Hero> selectOneHero = heroMapper.select(hero);
        System.out.println("Service层：select---"+selectOneHero);
        return hero;
    }
    @Override
    public List<Hero> selectAll() {
        List<Hero> heroes = heroMapper.selectAll();
        System.out.println("Service层：selectAll---"+heroes);
        return heroMapper.selectAll();
    }
    @Override
    public Hero selectByPrimaryKey(){
        Hero hero = heroMapper.selectByPrimaryKey(10);
        System.out.println("Service层：selectByPrimaryKey---"+hero);
        return heroMapper.selectByPrimaryKey(10);
    }


}
