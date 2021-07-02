package com.example.demo.registration;

import com.example.demo.appuser.UniqueEmail;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class RegistrationRequest {

    @NotNull
    @NotEmpty
    @Size(min = 3)
    private final String firstName;

    @NotNull
    @NotEmpty
    @Size(min = 3)
    private final String lastName;

    @NotNull
    @Email
    @UniqueEmail
    private final String email;

    @NotNull
    @NotEmpty
    @Size(min = 8)
    private final String password;
}
