package com.yago.guest.service.guestservice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/
@RestController
@RequestMapping(value="/guests")
@Api(value="guests", description = "Data service operations on guests", tags=("guests"))
public class GuestController {

    @Autowired
    private GuestRepository guestRepository;

    @RequestMapping(method= RequestMethod.GET)
    @ApiOperation(value="Get All Guests", notes="Gets all guests in the system", nickname="getGuests")
    public List<Guest> findAll(@RequestParam(name="emailAddress", required = false)String emailAddress){
        if(StringUtils.isNotBlank(emailAddress)){
            return Collections.singletonList(this.guestRepository.findByEmailAddress(emailAddress));
        }
        return (List<Guest>) this.guestRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Guest findOne(@PathVariable(name="id")long id){
        return this.guestRepository.findById(id).get();
    }
}
