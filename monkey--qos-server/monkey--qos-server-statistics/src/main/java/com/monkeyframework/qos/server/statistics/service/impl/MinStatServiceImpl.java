package com.monkeyframework.qos.server.statistics.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.monkeyframework.model.page.Pagination;
import com.monkeyframework.orm.mybatis.query.PageQuery;
import com.monkeyframework.qos.server.core.entity.MinStat;
import com.monkeyframework.qos.server.statistics.dao.MinStatDao;
import com.monkeyframework.qos.server.statistics.service.MinStatService;

@Service("minStatService")
public class MinStatServiceImpl implements MinStatService {

	@Resource
	private MinStatDao minStatDao;
	
	@SuppressWarnings("deprecation")
	public List<MinStat> findPageByAppAndDay(Pagination page, Date statDay, 
			String consumerAppName, String providerAppName) {
		PageQuery query = PageQuery.create(page);
		query.addParameters("consumerAppName", consumerAppName);
		query.addParameters("providerAppName", providerAppName);
		query.addParameters("statDate", statDay.getDate());
		query.addParameters("statMonth", statDay.getMonth());
		return minStatDao.findPage(query);
	}
}
