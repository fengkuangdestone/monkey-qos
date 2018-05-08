package com.monkeyframework.qos.server.monitor.service;

import com.monkeyframework.qos.server.monitor.model.Collect;

public interface MinCollectService {

	public void save(Collect collect);
	
	public void createTable();
}
