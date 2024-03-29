package com.yago.business.reservation.reservationbusinessservices;

import com.yago.business.reservation.reservationbusinessservices.client.GuestService;
import com.yago.business.reservation.reservationbusinessservices.client.ReservationService;
import com.yago.business.reservation.reservationbusinessservices.client.RoomService;
import com.yago.business.reservation.reservationbusinessservices.domain.Guest;
import com.yago.business.reservation.reservationbusinessservices.domain.Reservation;
import com.yago.business.reservation.reservationbusinessservices.domain.Room;
import com.yago.business.reservation.reservationbusinessservices.domain.RoomReservation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/
@Service
public class RoomReservationBusinessProcess {

    private GuestService guestService;
    private RoomService roomService;
    private ReservationService reservationService;

  @Autowired
  public RoomReservationBusinessProcess(GuestService guestService, RoomService roomService, ReservationService reservationService) {
    this.guestService = guestService;
    this.roomService = roomService;
    this.reservationService = reservationService;
  }

  public List<RoomReservation> getRoomReservationsForDate(String dateString){
    List<Room> rooms = this.roomService.findAll(null);
    Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
    rooms.forEach(room->{
      RoomReservation roomReservation = new RoomReservation();
      roomReservation.setRoomId(room.getId());
      roomReservation.setRoomName(room.getName());
      roomReservation.setRoomNumber(room.getRoomNumber());
      roomReservationMap.put(room.getId(), roomReservation);
    });
    Iterable<Reservation> reservations = this.reservationService.findAll(dateString);
    if(null!=reservations){
      reservations.forEach(reservation -> {
        Guest guest = this.guestService.findOne(reservation.getGuestId());
        if(null!=guest) {
          RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
          roomReservation.setDate(reservation.getReservationDate());
          roomReservation.setFirstName(guest.getFirstName());
          roomReservation.setLastName(guest.getLastName());
          roomReservation.setGuestId(guest.getId());
        }

      });
    }
    List<RoomReservation> roomReservations = new ArrayList<>();
    for(Long roomId:roomReservationMap.keySet()){
      roomReservations.add(roomReservationMap.get(roomId));
    }
    return roomReservations;
  }
}
