package com.rp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rp.service.model.OrderDetail;
import com.rp.service.model.Product;
import com.rp.service.model.User;

/**
 * 
 * Helper class for rewardPoint service
 *
 */
@Service
public class RPServiceHelper {

	/**
	 * Create dummy data for order
	 * 
	 * @return (@OrderDetail)
	 */
	public List<OrderDetail> getOrderDetails() {
		List<OrderDetail> orderDetails = new ArrayList<>();

		User user1 = new User(1, "Ricky", "Ponting", "street 1");
		User user2 = new User(2, "David", "Miller", "street 2");

		Product product1 = new Product(1, "Headphone", 40);
		Product product2 = new Product(2, "Gamepad", 10);
		Product product3 = new Product(3, "Watch", 20);
		Product product4 = new Product(4, "Wallet", 10);
		Product product5 = new Product(5, "Cap", 60);

		OrderDetail ordeDetail1 = new OrderDetail(user1, product1, 4, product1.getPrice() * 4, "05-02-2023",
				"Completed");
		OrderDetail ordeDetail2 = new OrderDetail(user2, product2, 1, product2.getPrice() * 1, "05-01-2023",
				"Completed");
		OrderDetail ordeDetail3 = new OrderDetail(user2, product3, 3, product3.getPrice() * 3, "13-01-2023",
				"Completed");
		OrderDetail ordeDetail4 = new OrderDetail(user1, product2, 1, product2.getPrice() * 1, "27-01-2023",
				"Completed");
		OrderDetail ordeDetail5 = new OrderDetail(user2, product5, 2, product5.getPrice() * 2, "01-02-2023",
				"Completed");
		OrderDetail ordeDetail6 = new OrderDetail(user1, product4, 5, product4.getPrice() * 5, "15-01-2023",
				"Completed");

		orderDetails.add(ordeDetail1);
		orderDetails.add(ordeDetail2);
		orderDetails.add(ordeDetail3);
		orderDetails.add(ordeDetail4);
		orderDetails.add(ordeDetail5);
		orderDetails.add(ordeDetail6);

		return orderDetails;

	}

	/**
	 * This method will calculate reward points based upon the order amount by
	 * user
	 * 
	 * @return
	 */
	public Integer calculateRewardPoint(Integer orderAmount) {

		Integer rewardPoints = 0;
		if (orderAmount != null) {
			if (orderAmount > 50 && orderAmount <= 100) {
				rewardPoints = (orderAmount - 50) * 1;
			} else if (orderAmount > 100) {
				rewardPoints = ((orderAmount - 100) * 2) + 50;
			}
		}
		return rewardPoints;
	}

}
