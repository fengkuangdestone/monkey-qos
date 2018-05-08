package com.monkeyframework.qos.server.monitor.dao;

import org.springframework.stereotype.Repository;

import com.monkeyframework.qos.server.core.entity.MinStat;


@Repository
public interface MinStatDao {
	
	public MinStat getByMd5(String md5);
	
	public void insert(MinStat ms);
	
	public void update(MinStat ms);
    
	public void createTable();
}