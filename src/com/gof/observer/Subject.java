package com.gof.observer;

/**
 * 主题对象管理某些数据, 当主题内的数据改变就会通知观察者.
 * @author xfc
 *
 */
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
