package com.monkeyframework.qos.server.statistics.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.monkeyframework.orm.mybatis.query.MapQuery;
import com.monkeyframework.orm.mybatis.query.PageQuery;
import com.monkeyframework.qos.server.core.entity.DayStatApp;

@Repository
public interface DayStatAppDao {
	
	public void createTable();
	
	public void insert(DayStatApp dsa);
	
	public void update(DayStatApp dsa);
    	
	public DayStatApp getByDate(MapQuery query);
	
	public List<DayStatApp> findByDate(MapQuery query);
	
	public List<DayStatApp> findPageByDate(PageQuery query);
	
	public List<DayStatApp> findPageByBetweenDate(PageQuery query);
		
}