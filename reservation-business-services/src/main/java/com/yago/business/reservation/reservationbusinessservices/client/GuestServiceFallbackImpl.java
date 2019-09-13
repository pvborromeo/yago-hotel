package com.yago.business.reservation.reservationbusinessservices.client;


import com.yago.business.reservation.reservationbusinessservices.domain.Guest;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * User: pborromeo Date: 2019-09-12 Time: 13:33
 **/
@Component
public class GuestServiceFallbackImpl implements GuestService {
    @Override
    public List<Guest> findAll(String emailAddress) {
        return Collections.emptyList();
    }

    @Override
    public Guest findOne(long id) {
        Guest guest = new Guest();
        guest.setFirstName("Guest");
        guest.setLastName("Occupied");
        return guest;
    }
}
