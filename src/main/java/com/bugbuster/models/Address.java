package com.bugbuster.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {
    private String emailAddress;
    private int phoneNumber;
    private String physicalAddress;
    private String postalCode;
    private Region region;
    private County county;
}
