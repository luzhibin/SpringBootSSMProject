package com.lzb.service;

import com.lzb.pojo.Hero;

import java.util.List;

/**
 * Created by luzhibin on 2019/11/5 23:34
 */
public interface HeroService {
    public List<Hero> getAllHero();
    public Hero select();
    public List<Hero> selectAll();
    public Hero selectByPrimaryKey();
}
