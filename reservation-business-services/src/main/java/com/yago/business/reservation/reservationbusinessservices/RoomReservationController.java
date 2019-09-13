package com.yago.business.reservation.reservationbusinessservices;

import com.yago.business.reservation.reservationbusinessservices.client.RoomService;
import com.yago.business.reservation.reservationbusinessservices.domain.Room;
import com.yago.business.reservation.reservationbusinessservices.domain.RoomReservation;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/
@RestController
public class RoomReservationController {

  @Autowired
  private RoomService roomService;

  @Autowired
  private RoomReservationBusinessProcess businessProcess;

  @RequestMapping(value = "/rooms", method = RequestMethod.GET)
  @ApiOperation(value="Get All Rooms", notes="Gets all rooms in the system", nickname="getRooms")
  public List<Room> getAllRooms(){

    return this.roomService.findAll(null);
  }


  @RequestMapping(value="/roomReservations/{date}", method=RequestMethod.GET)
  @ApiOperation(value="Get Room Reservations", notes="Gets all reservations for a specific date", nickname="getReservationsForDate")
  public List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date){
    return this.businessProcess.getRoomReservationsForDate(date);
  }

}
