package com.example.twoot.hexagonal.application.order.port.in;


import lombok.Getter;

@Getter
public class OrderRequest {

  private int money;

  public OrderRequest(int money) {
    this.money = money;
  }
}
