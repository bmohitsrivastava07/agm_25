package com.ArtGalleryManagement.Backend.Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.ArtGalleryManagement.Backend.Repository.CheckoutRepository;


@ExtendWith(MockitoExtension.class)
class ProductServiceTest{
	@Mock
	CheckoutRepository checkoutRepository;
	
	ProductServiceImpl productServiceImpl;
	
	@BeforeEach
	void setUp() {
		this.productServiceImpl=new ProductServiceImpl(this.checkoutRepository);
	}
	

	@ParameterizedTest
	@ValueSource(strings= "mohit@gmail.com")
	void currentLoansCountTest(String userEmail) {
	     assertEquals(1,productServiceImpl.currentLoansCount(userEmail));
		
	}
	
	@ParameterizedTest
	@CsvSource({"mohit@gmail.com,3"})
	void checkoutProductByUser(String userEmail,Long productId) {
		assertTrue(productServiceImpl.checkoutProductByUser(userEmail, productId));
	}
	
	
	
	
	

}
