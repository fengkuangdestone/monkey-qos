package com.monkeyframework.qos.server.statistics.dao;


import org.springframework.stereotype.Repository;

import com.monkeyframework.qos.server.core.entity.NodeInfo;


@Repository
public interface NodeInfoDao {
	
	public NodeInfo get(Long id);
	
	public void update(NodeInfo nodeInfo);
	
	public Long countByIp(String ip);
}