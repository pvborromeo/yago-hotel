package com.yago.reservation.service.reservationservice;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/

@Entity
@Table(name="RESERVATION")
@Setter
@Getter
public class ReservationEntity {
    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="ROOM_ID")
    private long roomId;
    @Column(name="GUEST_ID")
    private long guestId;
    @Column(name="RES_DATE")
    private Date date;
}
