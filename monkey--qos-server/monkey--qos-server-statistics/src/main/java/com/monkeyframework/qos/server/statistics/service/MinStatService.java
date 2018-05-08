package com.monkeyframework.qos.server.statistics.service;

import java.util.Date;
import java.util.List;

import com.monkeyframework.model.page.Pagination;
import com.monkeyframework.qos.server.core.entity.MinStat;

public interface MinStatService {
	
	public List<MinStat> findPageByAppAndDay(Pagination page, Date statDay, 
			String consumerAppName, String providerAppName);
	
}
