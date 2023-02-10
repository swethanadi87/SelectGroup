package com.rp.service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * This is model class for order details
 *
 */

@Setter
@Getter
@ToString
public class OrderDetail {

	private User user;

	private Product product;

	private Integer quantity;

	private Integer amount;

	private String orderOn;

	private String status;

	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(User user, Product product, Integer quantity, Integer amount, String orderOn, String status) {
		this.user =  user;
		this.product = product;
		this.quantity =  quantity;
		this.amount = amount;
		this.orderOn = orderOn;
		this.status = status;
	}

}
