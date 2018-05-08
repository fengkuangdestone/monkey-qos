package com.monkeyframework.qos.server.monitor.service;

import com.monkeyframework.qos.server.core.entity.NodeInfo;

public interface NodeInfoService {

	public NodeInfo getByIp(String ip);

	public Long genByIp(String ip);
	
	public void createTable();
}
