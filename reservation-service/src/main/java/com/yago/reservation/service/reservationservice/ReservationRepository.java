package com.yago.reservation.service.reservationservice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/
@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
    List<ReservationEntity> findByDate(Date date);
}
