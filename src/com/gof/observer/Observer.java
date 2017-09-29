package com.gof.observer;

/**
 * 观察者已经注册主题, 以便在主题数据改变时能够收到更新.
 * @author xfc
 *
 */
public interface Observer {
	void update(double temperature, double humidity, double pressure);
}
