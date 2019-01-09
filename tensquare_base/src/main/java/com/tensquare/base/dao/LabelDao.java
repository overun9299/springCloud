package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Dao层继承JpaRepository，JpaSpecificationExecutor分页查询需继承
 * Created by ZhangPY on 2018/12/30
 * Belong Organization OVERUN-9299
 * overun9299@163.com
 */
public interface LabelDao extends JpaRepository<Label,String> , JpaSpecificationExecutor<Label> {
}
