package com.spring.demo.controller;

import com.spring.demo.entity.CartItem;
import com.spring.demo.entity.Category;
import com.spring.demo.entity.Product;
import com.spring.demo.entity.User;
import com.spring.demo.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class StoreRestController {
    private final StoreService storeService;

    @Autowired
    public StoreRestController(StoreService theStoreService) {
        this.storeService = theStoreService;
    }
    
    @GetMapping("/user")
    public List<User> getUsers(){
        return storeService.findAllUser();
    }
    @PostMapping("/user")
    public void saveUser(@RequestBody User theUser){
        storeService.saveUser(theUser);
    }
    @GetMapping("/user/{theUserId}")
    public User getUser(@PathVariable int theUserId){
    	User user =  storeService.findByUserId(theUserId);
    	if(user == null) {
    		throw new RuntimeException("Not found this id" + theUserId);
    	}
    	return user;
    }
    @PutMapping("/user")
    public User updateUser(@RequestBody User theUser) {
    	storeService.saveUser(theUser);
    	return theUser;
    }
    @DeleteMapping("/user/{theUserId}")
    public String deleteCustomer(@PathVariable int theUserId) {
    	User user =  storeService.findByUserId(theUserId);
    	if (user == null) {
			throw new RuntimeException("User id not found - " + theUserId);
		}
    	storeService.deleteByUserId(theUserId);
    	return "Delete customer id: " + user;
    }
    
    @GetMapping("/products")
    public List<Product> getProducts(){
        return storeService.getAllProducts();
    }
    @PostMapping("/products")
    public void updateProduct(@RequestBody Product product){
        storeService.saveProduct(product);
    }
    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return storeService.getAllCategory();
    }
    @GetMapping("/category/{theCategoryId}")
    public List<Product> listProductByCategory(@PathVariable int theCategoryId){ 
    	return storeService.getListProductByCategory(theCategoryId); 
    }
//    @GetMapping("/user/cart/{cartItemId}")
//    public List<CartItem> getCartItemByUser(@PathVariable int cartItemId){
//        return storeService.findByUser(cartItemId);
//    }
    
    

}
