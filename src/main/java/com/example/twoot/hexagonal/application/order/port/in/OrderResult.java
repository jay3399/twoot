package com.example.twoot.hexagonal.application.order.port.in;

import lombok.Getter;

@Getter
public class OrderResult {

  private String Id;

  private int money;


  public OrderResult(String id, int money) {
    Id = id;
    this.money = money;
  }
}
