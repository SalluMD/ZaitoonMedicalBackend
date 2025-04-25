package medical.zaitoon.pharmacy.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import medical.zaitoon.pharmacy.model.enums.Gender;

import java.time.LocalDate;

public class UserSignupRequest {

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format", regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 128, message = "Password must be 8-128 characters")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must contain at least one uppercase, lowercase, number, and special character")
    private String password;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\+?[0-9\\s\\-()]{7,20}$",
            message = "Invalid phone number format")
    private String phoneNumber;

    @NotBlank(message = "Address is required")
    @Size(max = 200, message = "Address cannot exceed 200 characters")
    private String address;

    @NotBlank(message = "City is required")
    @Size(max = 50, message = "City cannot exceed 50 characters")
    private String city;

    @NotBlank(message = "State is required")
    @Size(max = 50, message = "State cannot exceed 50 characters")
    private String state;

    @NotBlank(message = "Zip code is required")
    @Pattern(regexp = "^[a-zA-Z0-9\\-]{3,10}$",
            message = "Invalid zip code format")
    private String zip;

    @NotBlank(message = "Country code is required (ISO 3166-1 alpha-2)")
    @Pattern(regexp = "^[A-Z]{2}$",
            message = "Country must be a valid 2-letter ISO code")
    private String country;

    @NotNull(message = "Gender is required")
    private Gender gender;

    @NotNull(message = "Birth date is required")
    @Past(message = "Birth date must be in the past")
    private LocalDate birthDate;

    @AssertTrue(message = "You must accept the terms and conditions")
    private Boolean termsAccepted;


    public UserSignupRequest(String firstName, String lastName, String email, String password, String phoneNumber, String address, String city, String state, String zip, String country, Gender gender, LocalDate birthDate, Boolean termsAccepted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.gender = gender;
        this.birthDate = birthDate;
        this.termsAccepted = termsAccepted;
    }

    public @NotBlank(message = "First name is required") @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "First name is required") @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters") String firstName) {
        this.firstName = firstName;
    }

    public @NotBlank(message = "Last name is required") @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "Last name is required") @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters") String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Invalid email format", regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Invalid email format", regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Password is required") @Size(min = 8, max = 128, message = "Password must be 8-128 characters") @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must contain at least one uppercase, lowercase, number, and special character") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") @Size(min = 8, max = 128, message = "Password must be 8-128 characters") @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must contain at least one uppercase, lowercase, number, and special character") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Phone number is required") @Pattern(regexp = "^\\+?[0-9\\s\\-()]{7,20}$",
            message = "Invalid phone number format") String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NotBlank(message = "Phone number is required") @Pattern(regexp = "^\\+?[0-9\\s\\-()]{7,20}$",
            message = "Invalid phone number format") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public @NotBlank(message = "Address is required") @Size(max = 200, message = "Address cannot exceed 200 characters") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "Address is required") @Size(max = 200, message = "Address cannot exceed 200 characters") String address) {
        this.address = address;
    }

    public @NotBlank(message = "City is required") @Size(max = 50, message = "City cannot exceed 50 characters") String getCity() {
        return city;
    }

    public void setCity(@NotBlank(message = "City is required") @Size(max = 50, message = "City cannot exceed 50 characters") String city) {
        this.city = city;
    }

    public @NotBlank(message = "State is required") @Size(max = 50, message = "State cannot exceed 50 characters") String getState() {
        return state;
    }

    public void setState(@NotBlank(message = "State is required") @Size(max = 50, message = "State cannot exceed 50 characters") String state) {
        this.state = state;
    }

    public @NotBlank(message = "Zip code is required") @Pattern(regexp = "^[a-zA-Z0-9\\-]{3,10}$",
            message = "Invalid zip code format") String getZip() {
        return zip;
    }

    public void setZip(@NotBlank(message = "Zip code is required") @Pattern(regexp = "^[a-zA-Z0-9\\-]{3,10}$",
            message = "Invalid zip code format") String zip) {
        this.zip = zip;
    }

    public @NotBlank(message = "Country code is required (ISO 3166-1 alpha-2)") @Pattern(regexp = "^[A-Z]{2}$",
            message = "Country must be a valid 2-letter ISO code") String getCountry() {
        return country;
    }

    public void setCountry(@NotBlank(message = "Country code is required (ISO 3166-1 alpha-2)") @Pattern(regexp = "^[A-Z]{2}$",
            message = "Country must be a valid 2-letter ISO code") String country) {
        this.country = country;
    }

    public @NotNull(message = "Gender is required") Gender getGender() {
        return gender;
    }

    public void setGender(@NotNull(message = "Gender is required") Gender gender) {
        this.gender = gender;
    }

    public @NotNull(message = "Birth date is required") @Past(message = "Birth date must be in the past") LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NotNull(message = "Birth date is required") @Past(message = "Birth date must be in the past") LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public @AssertTrue(message = "You must accept the terms and conditions") Boolean getTermsAccepted() {
        return termsAccepted;
    }

    public void setTermsAccepted(@AssertTrue(message = "You must accept the terms and conditions") Boolean termsAccepted) {
        this.termsAccepted = termsAccepted;
    }

    @Override
    public String toString() {
        return "UserSignupRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", termsAccepted=" + termsAccepted +
                '}';
    }
}