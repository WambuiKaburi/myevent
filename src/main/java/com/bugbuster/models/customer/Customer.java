package com.bugbuster.models.customer;

import com.bugbuster.models.serviceprovider.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    @Embedded
    private Address address;

    public void setId(Long id) {
        this.id = id;
    }
}
