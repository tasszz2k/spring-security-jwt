package com.example.springsecurityjwt.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthenticationRequest {

    private String username;
    private String password;
}
