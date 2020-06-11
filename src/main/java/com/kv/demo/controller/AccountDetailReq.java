package com.kv.demo.controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public class AccountDetailReq implements Serializable {

  private String firstName = null;

  private String lastName = null;

  private OffsetDateTime createdOn = null;

  private LocalDate dob = null;


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }
}
