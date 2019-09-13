package com.yago.business.reservation.reservationbusinessservices.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:25
 **/

@Getter
@Setter

public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private String date;
}