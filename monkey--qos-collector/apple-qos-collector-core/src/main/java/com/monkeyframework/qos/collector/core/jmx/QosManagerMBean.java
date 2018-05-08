package com.monkeyframework.qos.collector.core.jmx;

public interface QosManagerMBean {

	public String getName();

	public void start();

	public void stop();

	public boolean isRunning();
}
