package com.revature.datalayer;

import java.util.ArrayList;

public interface DAO<T> {

	ArrayList<T> getAll();
	T getInstanceByField(T newInstance);
	void addInstance(T newInstance);

}
