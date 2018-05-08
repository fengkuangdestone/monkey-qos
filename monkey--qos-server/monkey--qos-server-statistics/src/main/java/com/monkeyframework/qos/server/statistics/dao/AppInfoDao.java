package com.monkeyframework.qos.server.statistics.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.monkeyframework.orm.mybatis.query.PageQuery;
import com.monkeyframework.qos.server.core.entity.AppInfo;

@Repository
public interface AppInfoDao {
	
	public AppInfo get(Long id);
		
	public void update(AppInfo appInfo);
	
	public Integer countByCode(String code);
	
	public List<AppInfo> findPage(PageQuery query);
		    
}