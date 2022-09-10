package com.BridgeLabz.FundooApp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
Class to fetch the data from the query
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FetchAllUsers {
    private String firstName;
    private String lastName;
    private String email;
    private boolean isVerified = false;
}