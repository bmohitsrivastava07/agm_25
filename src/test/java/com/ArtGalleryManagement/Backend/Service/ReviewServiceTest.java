package com.ArtGalleryManagement.Backend.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ArtGalleryManagement.Backend.Repository.CheckoutRepository;
import com.ArtGalleryManagement.Backend.Repository.ReviewRepository;

@ExtendWith(MockitoExtension.class)
class ReviewServiceTest {
	
	@Mock
	ReviewRepository reviewRepository;
	
	@InjectMocks
	ReviewServiceImpl reviewServiceImpl;
	
	
	@ParameterizedTest
	@ValueSource(longs={1})
	void reviewProductByUserTest(Long productId) {
		String userEmail="arsh@gmail.com";
	     assertTrue(reviewServiceImpl.userReviewListed(userEmail,productId));
		
	}

}
