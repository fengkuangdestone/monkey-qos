package com.monkeyframework.qos.server.statistics.service;

import java.util.Date;

import com.monkeyframework.model.Search;
import com.monkeyframework.model.page.Pagination;
import com.monkeyframework.qos.server.core.entity.DayStatMethod;
import com.monkeyframework.qos.server.statistics.model.DayStatMethodSo;

public interface DayStatMethodService {
	
	public void createTable();

	public void save(DayStatMethod dsm);
	
	public void update(DayStatMethod dsm);
	
	public DayStatMethod getByDate(Date statDate, Long consumerAppId, Long providerAppId,
			String service, String method);
	
	public Pagination findPage(Pagination page, DayStatMethodSo so, Search se);
	
}