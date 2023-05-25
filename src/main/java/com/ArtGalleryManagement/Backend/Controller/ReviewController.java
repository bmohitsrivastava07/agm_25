package com.ArtGalleryManagement.Backend.Controller;

import com.ArtGalleryManagement.Backend.GlobalExceptionsHandler.UserEmailNotFoundException;
import com.ArtGalleryManagement.Backend.RequestModels.*;
import com.ArtGalleryManagement.Backend.Service.*;

/*import com.ArtGalleryManagement.Backend.utils.*;*/
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://localhost:3000")
@RestController
@RequestMapping("/reviews")
public class ReviewController {

	private ReviewServiceImpl reviewService;

	public ReviewController(ReviewServiceImpl reviewService) {
		this.reviewService = reviewService;
	}

	@GetMapping("/secure/user/product")
	public Boolean reviewProductByUser(@RequestParam Long productId) throws Exception {
		String userEmail = "arsh@gmail.com";

		if (userEmail == null) {
			throw new UserEmailNotFoundException();
		}
		return reviewService.userReviewListed(userEmail, productId);
	}

	@PostMapping("/secure")
	public void postReview(@RequestBody ReviewRequest reviewRequest) throws Exception {
		String userEmail = "ankita@gmail.com";
		if (userEmail == null) {
			throw new UserEmailNotFoundException();
		}
		reviewService.postReview(userEmail, reviewRequest);
	}
}
