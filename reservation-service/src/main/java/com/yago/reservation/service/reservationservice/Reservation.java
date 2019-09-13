package com.yago.reservation.service.reservationservice;
import lombok.Getter;
import lombok.Setter;


/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/
@Getter
@Setter
public class Reservation {

    private long id;
    private long roomId;
    private long guestId;
    private String reservationDate;
}
