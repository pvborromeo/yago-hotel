package com.yago.reservation.webapp.reservationwebapp.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * User: pborromeo Date: 2019-09-11 Time: 14:44
 **/
@Setter
@Getter
public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private String date;
}