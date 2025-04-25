package medical.zaitoon.pharmacy.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import medical.zaitoon.pharmacy.model.enums.Gender;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersDataRequestDto {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String phone;

    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private Gender gender;
    private LocalDate birthDate;

    @AssertTrue(message = "You must accept the terms and conditions")
    private boolean terms;
}
