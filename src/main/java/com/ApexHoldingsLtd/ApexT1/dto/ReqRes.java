package com.ApexHoldingsLtd.ApexT1.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ApexHoldingsLtd.ApexT1.entity.OurUsers;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;

    // User details
    private String name;
    private String userid;
    private String designation;
    private String deptmstcode;
    private String role;
    private String email;
    private String password;

    // User and user list
    private OurUsers ourUsers;
    private List<OurUsers> ourUsersList;

    // Pagination details
    private long totalElements; // Total number of elements
    private int totalPages;     // Total number of pages

}
