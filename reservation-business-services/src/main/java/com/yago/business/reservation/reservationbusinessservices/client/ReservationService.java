package com.yago.business.reservation.reservationbusinessservices.client;


import com.yago.business.reservation.reservationbusinessservices.domain.Reservation;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: pborromeo Date: 2019-09-12 Time: 13:33
 **/
@FeignClient("RESERVATIONSERVICE")
public interface ReservationService {
    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    List<Reservation> findAll(@RequestParam(name = "date", required = false) String date);
}