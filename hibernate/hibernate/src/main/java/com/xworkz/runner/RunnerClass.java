package com.xworkz.runner;

import com.xworkz.dao.RestaurantDAO;
import com.xworkz.entity.RestaurantEntity;

public class RunnerClass {

	public static void main(String []args) {
		RestaurantEntity restaurantEntity=new RestaurantEntity();
		restaurantEntity.setRestuarantId(2);
		restaurantEntity.setContactNo(987654);
		restaurantEntity.setName("Giriyas");
		restaurantEntity.setRating(4.3);
		restaurantEntity.setType("PureVeg");
		
		RestaurantDAO  restaurantDAO=new RestaurantDAO();
		restaurantDAO.saveRestaurant(restaurantEntity);
		System.out.println("saved succefully");
		}
}
