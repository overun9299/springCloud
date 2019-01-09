package com.tensquare.spit.dao;

import com.tensquare.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by ZhangPY on 2019/1/3
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 */
public interface SpitDao extends MongoRepository<Spit, String> {


    public Page<Spit> findByParentid(String parentid, Pageable pageable);
}
