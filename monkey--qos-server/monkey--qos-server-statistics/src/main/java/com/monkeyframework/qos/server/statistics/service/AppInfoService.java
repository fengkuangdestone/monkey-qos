package com.monkeyframework.qos.server.statistics.service;

import com.monkeyframework.exception.ServiceException;
import com.monkeyframework.model.page.Pagination;
import com.monkeyframework.qos.server.core.entity.AppInfo;

public interface AppInfoService {
	
	public AppInfo get(Long id);
	
	public void update(AppInfo appInfo) throws ServiceException;
			
	public boolean isUniqueByCode(String oldCode, String newCode);
	
	public boolean isExistByCode(String code);
	
	public Pagination findPage(Pagination page, String keyword);
}
