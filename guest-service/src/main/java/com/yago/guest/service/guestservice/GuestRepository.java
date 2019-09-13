package com.yago.guest.service.guestservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/
@Repository
public interface GuestRepository extends CrudRepository<Guest, Long>{
    Guest findByEmailAddress(String emailAddress);
}
