package com.monkeyframework.qos.server.statistics.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.monkeyframework.orm.mybatis.query.MapQuery;
import com.monkeyframework.qos.server.core.entity.MinCollect;
import com.monkeyframework.qos.server.statistics.model.DaySumApp;
import com.monkeyframework.qos.server.statistics.model.DaySumCode;
import com.monkeyframework.qos.server.statistics.model.DaySumNode;
import com.monkeyframework.qos.server.statistics.model.DaySumMethod;

@Repository
public interface MinCollectDao {
	
	public void insert(MinCollect sc);
    	
	public List<MinCollect> findAppByDate(@Param("collectDate")Date collectDate);
	public List<MinCollect> findCodeByDate(@Param("collectDate")Date collectDate);
	public List<MinCollect> findNodeByDate(@Param("collectDate")Date collectDate);
	public List<MinCollect> findMethodByDate(@Param("collectDate")Date collectDate);

	public DaySumApp sumSuccessByApp(MapQuery query);
	public DaySumApp sumFailureByApp(MapQuery query);
	
	public DaySumCode sumCodeByApp(MapQuery query);
	public DaySumNode sumNodeByApp(MapQuery query);
	
	public DaySumMethod sumSuccessByMethod(MapQuery query);
	public DaySumMethod sumFailureByMethod(MapQuery query);
}