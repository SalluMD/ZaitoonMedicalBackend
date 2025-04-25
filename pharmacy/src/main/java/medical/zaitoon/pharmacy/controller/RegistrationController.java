package medical.zaitoon.pharmacy.controller;

import medical.zaitoon.pharmacy.request.LoginRequest;
import medical.zaitoon.pharmacy.request.UserSignupRequest;
import medical.zaitoon.pharmacy.response.ApiResponse;
import medical.zaitoon.pharmacy.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class RegistrationController {
    @Autowired private RegistrationService registrationService;

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse> createUser(@RequestBody UserSignupRequest userSignupRequest) {
        return registrationService.userSignup(userSignupRequest);
    }
}
