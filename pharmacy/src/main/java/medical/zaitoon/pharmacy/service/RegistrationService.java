package medical.zaitoon.pharmacy.service;

import medical.zaitoon.pharmacy.request.LoginRequest;
import medical.zaitoon.pharmacy.request.UserSignupRequest;
import medical.zaitoon.pharmacy.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;

public interface RegistrationService {

    public ResponseEntity<ApiResponse> userSignup(UserSignupRequest userSignupRequest);
}
