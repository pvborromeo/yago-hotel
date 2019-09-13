package com.yago.reservation.webapp.reservationwebapp.client;


import com.yago.reservation.webapp.reservationwebapp.domain.Room;
import com.yago.reservation.webapp.reservationwebapp.domain.RoomReservation;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * User: pborromeo Date: 2019-09-11 Time: 14:44
 **/

@FeignClient("RESERVATIONBUSINESSSERVICES")
public interface RoomReservationService {

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    List<Room> getAllRooms(
        @RequestParam(name = "roomNumber", required = false) String roomNumber);

    @RequestMapping(value="/roomReservations/{date}", method=RequestMethod.GET)
    List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date);
}
