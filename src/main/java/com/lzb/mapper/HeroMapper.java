package com.lzb.mapper;

import com.lzb.pojo.Hero;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by luzhibin on 2019/11/5 16:58
 */
@Repository
public interface HeroMapper extends Mapper<Hero> {

    public List<Hero> getAllHero();
}
