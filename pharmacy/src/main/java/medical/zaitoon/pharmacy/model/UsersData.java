package medical.zaitoon.pharmacy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import medical.zaitoon.pharmacy.model.enums.Gender;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users_data", schema = "users") // Avoid spaces in schema/table names
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersData {

    @Id
    @NotBlank(message = "Phone number is required")
    @Column(nullable = false, unique = true, length = 15)
    private String phone;

    @NotBlank(message = "First name is required")
    @Column(nullable = false, length = 50)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Column(nullable = false, length = 50)
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @NotBlank(message = "Password is required")
    @Column(nullable = false)
    private String password;

    @Column(length = 255)
    private String address;

    @Column(length = 50)
    private String city;

    @Column(length = 50)
    private String state;

    @Column(length = 10)
    private String zip;

    @Column(length = 50)
    private String country;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;

    @Column(nullable = false)
    private boolean terms; // true if accepted

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
