package com.monkeyframework.qos.server.statistics.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.monkeyframework.orm.mybatis.query.PageQuery;
import com.monkeyframework.qos.server.core.entity.MinStat;

@Repository
public interface MinStatDao {
	
	public List<MinStat> findPage(PageQuery query);
	
}