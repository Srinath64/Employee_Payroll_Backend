package com.bridgelabz.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO
{
    public int id;

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;

    @Min(value = 5000, message = "min Wage should be more than 5000")
    public long salary;

    @Pattern(regexp = "male|female", message = "gender needs to be male or female")
    public String gender;

//    @JsonFormat(pattern = "dd MMM yyy")
//    @NotNull(message = "Start date should not be epmty")
//    @PastOrPresent(message = "Start date should pe past or today")
    public String startDate;

    //@NotBlank(message = "note cannot be empty")
    public String note;

    //@NotBlank(message = "profilepic cannot be empty")
    public String profilePic;

    //@NotNull(message = "department should not be epmty")
    public List<String> department;

}
