package com.yago.reservation.webapp.reservationwebapp;

import com.yago.reservation.webapp.reservationwebapp.client.RoomReservationService;
import com.yago.reservation.webapp.reservationwebapp.domain.RoomReservation;
import io.micrometer.core.instrument.util.StringUtils;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * User: pborromeo Date: 2019-09-11 Time: 14:44
 **/
@Controller
@RequestMapping(value="/reservations")
public class ReservationController {

    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private final RoomReservationService roomReservationService;


    @Autowired
    public ReservationController(RoomReservationService roomReservationService){
        super();
        this.roomReservationService = roomReservationService;
    }

    @RequestMapping(method= RequestMethod.GET)
    public String getReservations(@RequestParam(value="date", required=false)String dateString, Model model){
        String date = dateString;
        if(StringUtils.isBlank(dateString)){
            date = this.createTodayDateString();
        }
        List<RoomReservation> roomReservations = this.roomReservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "reservations";
    }

    public String createTodayDateString(){
        return DATE_FORMAT.format(new Date());
    }
}