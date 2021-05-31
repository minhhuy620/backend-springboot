package com.spring.demo.service;

import com.spring.demo.entity.CartItem;
import com.spring.demo.entity.Category;
import com.spring.demo.entity.Product;
import com.spring.demo.entity.User;
import java.util.List;

public interface StoreService {
	// User
    List<User> findAllUser();
    void saveUser(User theUser);
    User findByUserId(int theId);
	void deleteByUserId(int theId);
	
	// Store
    List<Product> getAllProducts();
    List<Category> getAllCategory();
    List<Product> getListProductByCategory(int categoryId);
//    List<CartItem> findByUser(int theUserId);
    
    //Admin
    Product findByProductId(int theId);
	void saveProduct(Product product);
    void deleteByProductId(int theId);
}
