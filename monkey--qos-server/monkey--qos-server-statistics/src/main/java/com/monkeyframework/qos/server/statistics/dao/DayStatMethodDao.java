package com.monkeyframework.qos.server.statistics.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.monkeyframework.model.Search;
import com.monkeyframework.model.page.Pagination;
import com.monkeyframework.orm.mybatis.query.MapQuery;
import com.monkeyframework.qos.server.core.entity.DayStatMethod;
import com.monkeyframework.qos.server.statistics.model.DayStatMethodSo;

@Repository
public interface DayStatMethodDao {
	
	public void createTable();
	
	public void insert(DayStatMethod dsm);
	
	public void update(DayStatMethod dsm);
    	
	public DayStatMethod getByDate(MapQuery query);
	
	public List<DayStatMethod> findPage(@Param("page")Pagination page, @Param("so") DayStatMethodSo so, 
			@Param("se") Search se);
	
}