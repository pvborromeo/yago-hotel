package com.yago.guest.service.guestservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * User: pborromeo Date: 2019-09-11 Time: 17:28
 **/
@Entity
@Table(name = "GUEST")
@Getter
@Setter
public class Guest {

  @Id
  @Column(name = "GUEST_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "LAST_NAME")
  private String lastName;

  @Column(name = "EMAIL_ADDRESS")
  private String emailAddress;

  @Column(name = "ADDRESS")
  private String address;

  @Column(name = "COUNTRY")
  private String country;

  @Column(name = "STATES")
  private String states;

  @Column(name = "PHONE_NUMBER")
  private String phoneNumber;


}
