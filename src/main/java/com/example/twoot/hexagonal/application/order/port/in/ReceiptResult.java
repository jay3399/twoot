package com.example.twoot.hexagonal.application.order.port.in;

public class ReceiptResult {

  private String orderId;

  private int money;


  public ReceiptResult(String orderId, int money) {
    this.orderId = orderId;
    this.money = money;
  }
}
