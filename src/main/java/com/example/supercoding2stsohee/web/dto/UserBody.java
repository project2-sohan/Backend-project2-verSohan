package com.example.supercoding2stsohee.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserBody {
    @Schema(description="phone_number")
    private String phoneNumber;
    @Schema(description="email")
    private String email;
    @Schema(description="nick_name")
    private String nickName;
    @Schema(description="password")
    private String password;
}
