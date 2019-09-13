package com.yago.business.reservation.reservationbusinessservices.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:25
 **/

@Getter
@Setter
public class Reservation {
    private long id;
    private long roomId;
    private long guestId;
    private String reservationDate;
}
