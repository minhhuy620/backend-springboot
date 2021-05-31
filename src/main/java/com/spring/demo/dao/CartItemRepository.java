package com.spring.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.spring.demo.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer>{
//	@Query(value = "select p.product_name,c.quantity,p.product_price from Product p left join Cart_Item c on p.pid = c.product_id "
//			+ "left join Users u on c.user_id = u.uid where u.uid = ?1 ")
//	public List<CartItem> findByUser(int categoryId);
}
