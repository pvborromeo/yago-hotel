package com.yago.services.room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User: pborromeo Date: 2019-09-11 Time: 14:43
 **/
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

  Room findByRoomNumber(String roomNumber);
}
