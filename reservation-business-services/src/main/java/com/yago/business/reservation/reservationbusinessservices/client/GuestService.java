package com.yago.business.reservation.reservationbusinessservices.client;

import com.yago.business.reservation.reservationbusinessservices.domain.Guest;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: pborromeo Date: 2019-09-12 Time: 13:33
 **/
@FeignClient(value = "GUESTSERVICE", fallback = GuestServiceFallbackImpl.class)
public interface GuestService {

    @RequestMapping(value="/guests", method= RequestMethod.GET)
    List<Guest> findAll(@RequestParam(name = "emailAddress", required = false) String emailAddress);

    @RequestMapping(value = "/guests/{id}", method = RequestMethod.GET)
    Guest findOne(@PathVariable(name = "id") long id);
}
