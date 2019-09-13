package com.yago.business.reservation.reservationbusinessservices.client;

import com.yago.business.reservation.reservationbusinessservices.domain.Room;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: pborromeo Date: 2019-09-12 Time: 13:33
 **/
@FeignClient(value = "ROOMSERVICE")
public interface RoomService {

  @RequestMapping(value = "/rooms", method = RequestMethod.GET)
  List<Room> findAll (@RequestParam(name= "roomNumber", required = false) String roomNumber);
}
