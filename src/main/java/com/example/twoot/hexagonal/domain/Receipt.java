package com.example.twoot.hexagonal.domain;

public class Receipt {

  private String orderId;
  private int money;

  public Receipt(String orderId, int money) {
    this.orderId = orderId;
    this.money = money;
  }
}
