package com.spring.demo.service;

import com.spring.demo.dao.CartItemRepository;
import com.spring.demo.dao.CategoryRepository;
import com.spring.demo.dao.ProductRepository;
import com.spring.demo.dao.UserRepository;
import com.spring.demo.entity.CartItem;
import com.spring.demo.entity.Category;
import com.spring.demo.entity.Product;
import com.spring.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {
	
	private final UserRepository userRepository;
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;
	private final CartItemRepository cartitemRepository;
	
	@Autowired
	public StoreServiceImpl(UserRepository theUserRepository,ProductRepository theProductRepository, CategoryRepository theCategoryRepository, CartItemRepository theCartItemRepository) {
		this.userRepository = theUserRepository;
		this.productRepository = theProductRepository;
		this.categoryRepository = theCategoryRepository;
		this.cartitemRepository = theCartItemRepository;
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void saveUser(User theUser) {
		userRepository.save(theUser);
		
	}

	@Override
	public User findByUserId(int theId) {
		Optional<User> result = userRepository.findById(theId);
		User theUser = null;
		if(result.isPresent()) {
			theUser = result.get();
		}
		else {
			throw new RuntimeException("Did not find this User id - " + theId);
		}
		return theUser;
	}

	@Override
	public void deleteByUserId(int theId) {	
		userRepository.deleteById(theId);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public List<Product> getListProductByCategory(int categoryId) {
		// TODO Auto-generated method stub
		return productRepository.getListProductByCategory(categoryId);
	}

//	@Override
//	public List<CartItem> findByUser(int theUserId) {
//		// TODO Auto-generated method stub
//		return cartitemRepository.findByUser(theUserId);
//	}

	@Override
	public Product findByProductId(int theId) {
		Optional<Product> result = productRepository.findById(theId);
		Product theProduct = null;
		if(result.isPresent()) {
			theProduct = result.get();
		}
		else {
			throw new RuntimeException("Did not find this Product id - " + theId);
		}
		return theProduct;
	}

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteByProductId(int theId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(theId);
	}

}
