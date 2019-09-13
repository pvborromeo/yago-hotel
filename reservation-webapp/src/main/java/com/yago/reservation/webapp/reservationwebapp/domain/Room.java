package com.yago.reservation.webapp.reservationwebapp.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * User: pborromeo Date: 2019-09-11 Time: 14:44
 **/

@Getter
@Setter
public class Room {
    private long id;
    private String name;
    private String roomNumber;
    private String bedInfo;
}
