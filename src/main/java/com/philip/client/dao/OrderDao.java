package com.philip.client.dao;

import java.util.List;

import com.philip.client.model.Order;

public interface OrderDao {

	List<Order> queryAll();
}