package com.yago.services.room;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 * User: pborromeo Date: 2019-09-11 Time: 14:38
 **/

@Entity
@Table(name = "ROOM")
@Getter
@Setter
public class Room {
  @Id
  @Column(name = "ROOM_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "ROOM_NUMBER")
  private String roomNumber;

  @Column(name= " BED_INFO")
  private String bedInfo;


}
