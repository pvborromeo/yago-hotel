package com.yago.business.reservation.reservationbusinessservices.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:25
 **/

@Getter
@Setter
public class Guest {
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;
}
