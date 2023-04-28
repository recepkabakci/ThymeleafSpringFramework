package com.recepkabakci.dto;
import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class EmployeeDto {

    private Long employeeId;

    @NotEmpty(message = "You have to enter your name")
    @Size(min = 1,max=100)
    private String employeeNameSurname;

    @NotEmpty(message = "You have to enter your email")
    @Email (message = "Please enter email format")
    private String employeeEmail;

    @NotEmpty(message = "You have to enter your password")
    @Size(min=6,max=20)
    private String employeePassword;
}
