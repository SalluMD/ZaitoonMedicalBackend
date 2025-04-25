package medical.zaitoon.pharmacy.service;


import medical.zaitoon.pharmacy.exceptions.MissingDetailsException;
import medical.zaitoon.pharmacy.model.UsersData;
import medical.zaitoon.pharmacy.repository.UserSignupRepository;
import medical.zaitoon.pharmacy.request.UserSignupRequest;
import medical.zaitoon.pharmacy.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private UserSignupRepository userSignupRepository;

    @Override
    public ResponseEntity<ApiResponse> userSignup(UserSignupRequest userSignupRequest) {
        UsersData usersData = UsersData.builder()
                .firstName(userSignupRequest.getFirstName())
                .lastName(userSignupRequest.getLastName())
                .email(userSignupRequest.getEmail())
                .password(userSignupRequest.getPassword())
                .phone(userSignupRequest.getPhoneNumber())
                .address(userSignupRequest.getAddress())
                .city(userSignupRequest.getCity())
                .state(userSignupRequest.getState())
                .zip(userSignupRequest.getZip())
                .country(userSignupRequest.getCountry())
                .gender(userSignupRequest.getGender())
                .birthDate(userSignupRequest.getBirthDate())
                .terms(userSignupRequest.getTermsAccepted())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        try {
            userSignupRepository.save(usersData);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.ok(ApiResponse.success("saved"));
    }
}
