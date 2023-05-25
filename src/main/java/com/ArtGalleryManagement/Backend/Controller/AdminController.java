package com.ArtGalleryManagement.Backend.Controller;

import com.ArtGalleryManagement.Backend.GlobalExceptionsHandler.MethodNotAllowedException;
import com.ArtGalleryManagement.Backend.RequestModels.*;
import com.ArtGalleryManagement.Backend.Service.*;

/*import com.ArtGalleryManagement.Backend.utils.*;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://localhost:3000")
@RestController
@RequestMapping("/admin")
public class AdminController {

    private AdminServiceImpl adminService;

    @Autowired
    public AdminController(AdminServiceImpl adminService) {
        this.adminService = adminService;
    }

    @PutMapping("/secure/increase/product/quantity")
    public void increaseProductQuantity(@RequestParam Long productId) throws Exception {
        String admin = "admin";
        if (admin == null || !admin.equals("admin")) {
            throw new MethodNotAllowedException();
        }
        adminService.increaseProductQuantity(productId);
    }

    @PutMapping("/secure/decrease/product/quantity")
    public void decreaseProductQuantity(@RequestParam Long productId) throws Exception {
        String admin ="admin";
        if (admin == null || !admin.equals("admin")) {
            throw new MethodNotAllowedException();
        }
        adminService.decreaseProductQuantity(productId);
    }

    @PostMapping("/secure/add/product")
    public void postProduct(@RequestBody AddProductRequest addBookRequest) throws Exception {
        String admin = "admin";
        if (admin == null || !admin.equals("admin")) {
            throw new MethodNotAllowedException();
        }
        adminService.postProduct(addBookRequest);
    }

    @DeleteMapping("/secure/delete/product")
    public void deleteProduct(@RequestParam Long productId) throws Exception {
        String admin = "admin";
        if (admin == null || !admin.equals("admin")) {
            throw new MethodNotAllowedException();
        }
        adminService.deleteProduct(productId);
    }

}












