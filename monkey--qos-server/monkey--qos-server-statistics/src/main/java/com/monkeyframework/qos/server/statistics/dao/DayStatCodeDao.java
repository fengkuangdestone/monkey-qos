package com.monkeyframework.qos.server.statistics.dao;

import org.springframework.stereotype.Repository;

import com.monkeyframework.orm.mybatis.query.MapQuery;
import com.monkeyframework.qos.server.core.entity.DayStatCode;

@Repository
public interface DayStatCodeDao {
	
	public void createTable();
	
	public void insert(DayStatCode dsc);
	
	public void update(DayStatCode dsc);
    	
	public DayStatCode getByDate(MapQuery query);
	
	/*public List<DayStatCode> findByAppAndDay(Map<String, Object> param);

	public List<DayStatCode> findPageByAppAndDay(PageQuery query);*/

}